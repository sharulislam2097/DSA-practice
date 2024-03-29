public class insertion_sort {
    public static void insertionSort(int arr[], int n) {

        for (int i = 1; i < n; i++) {
            int temp = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];

                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 1, 5, 9, 2 };
        int n = arr.length;
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
