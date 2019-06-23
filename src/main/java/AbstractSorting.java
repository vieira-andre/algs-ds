abstract class AbstractSorting implements ISortable {   
    int[] arr;
    int size;

    public AbstractSorting(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}