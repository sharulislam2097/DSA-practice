public class Sumof_array_elements {
    public static int sumArray(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }

        return arr[i]+sumArray(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {3,2,5,1,6};

        System.out.println(sumArray(arr , 0));

    }

}