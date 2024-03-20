public class Binary_Search {

    public static boolean binarySearch(int[] arr, int key, int start, int end) {

        //base case
        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;

        //main case
        if (arr[mid] == key) {
            return true;
        }

        if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, end);

        } else {
            return binarySearch(arr, key, start, mid - 1);
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 12, 14, 16, 18};
        int key = 14;

        System.out.println(binarySearch(arr, key, 0, arr.length - 1));

    }
}