// check if elements of array sorted or not
public class check_sorted_array {
    public static boolean isSorted(int[] arr , int  i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr , i+1);

    }

    public static void main(String[] args){
        int[] arr={3,5,7,9,12};

        System.out.println(isSorted(arr , 0));


    }
}
