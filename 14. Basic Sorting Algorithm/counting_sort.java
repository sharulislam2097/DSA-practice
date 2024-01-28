public class counting_sort {
    public static void countingSort(int arr[]) {
        // find out range of array element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // create count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // {1, 4, 1, 3, 2, 4, 3, 7} -arr j
        // {0, 2, 1, 2, 2, 0, 0, 1} -count i
        // {1, 1, 2, 3, 3, 4, 4, 7} -sorted

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }

        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        countingSort(arr);
    }
}
