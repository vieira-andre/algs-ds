class InsertionSort extends AbstractSorting {
    public InsertionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        for (int i = 1; i < this.size; i++) {
            int key = arr[i], j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = key;
        }
    }    
}