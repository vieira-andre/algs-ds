import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractSortingTest {
    static int[] simpleInput, simpleExpected;
    static int[] largeInput, largeExpected;
    AbstractSorting algorithm;
    
    @BeforeClass
    public static void initialize_SimpleArrays() {
        simpleInput = new int[] { 5, 7, 3, 1, 4, 2, 6 };
        simpleExpected = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    @BeforeClass
    public static void initialize_LargeArrays() {
        largeInput = new int[1000];

        for (int i = 1; i <= largeInput.length; i++) {
            largeInput[i-1] = i;
        }

        largeExpected = largeInput.clone();

        shuffleArray(largeInput);
    }

    public void testSimpleSort_BubbleSort() {
        algorithm = new BubbleSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(simpleExpected, algorithm.arr);
    }

    @Test
    public void testSimpleSort_InsertionSort() {
        algorithm = new InsertionSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(simpleExpected, algorithm.arr);
    }

    @Test
    public void testSimpleSort_SelectionSort() {
        algorithm = new SelectionSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(simpleExpected, algorithm.arr);
    }
}