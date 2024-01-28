public class counting_sort2 {

    public static void countingSort(int arr[]) {
        int n = arr.length;
        // find out range of array element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // create count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < largest; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int output[] = new int[n];

        // sorting
        for (int i = n - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        countingSort(arr);
    }
}
