import java.util.Arrays;

import java.util.Collections;
public class inbuild_arraysort {

    public static void main(String[] args) {
        Integer arr[]={5,3,8,2,1,9,4,7,6};

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0 ; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }




    }
}