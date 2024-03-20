public class Binary_Search {
    public static boolean binarySearch(int[] arr, int s, int e, int key) {
        //base case
        if (s > e) {
            return false;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == key) {
            return true;
        }

        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, e, key);
        } else {
            return binarySearch(arr, s, mid - 1, key);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 14, 16};
        int key = 23;

        System.out.println(binarySearch(arr, 0, arr.length - 1, key));
    }
}
