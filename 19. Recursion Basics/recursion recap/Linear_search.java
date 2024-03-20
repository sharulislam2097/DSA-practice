public class Linear_search {
    public static boolean linerSearch(int[] arr, int i, int key) {
        if (i == arr.length) {
            return false;
        }

        if (arr[i] == key) {
            return true;
        }

        return linerSearch(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 3, 4, 8, 0, 6};
        int key = 4;

        System.out.println(linerSearch(arr, 0, key));

    }


}