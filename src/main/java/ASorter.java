public abstract class ASorter {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (compare(arr[j], arr[j + 1])) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public abstract boolean compare(int a, int b);

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
