import com.sun.security.jgss.GSSUtil;

public class recursion_recap1 {

    //find factorial of n using recursion
//    public static int factorial(int n){
//        if(n==0){
//            return 1;
//        }
//        return (n*factorial(n-1));
//    }

    //print number from 1 to 10
//    public static void print(int n){
//        if(n==10){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//
//    }

    //find nth fibonacci number
//    public static int fib(int n){
//        //base condition
//        if(n==0 || n==1){
//            return n;
//        }
//        return fib(n-1)+fib(n-2);
//    }

    // binary search using recursion

    public static int search (int[] arr, int target , int s, int e){
        //base case
        if(s>e){
            return -1;
        }
        //processing
        int m = s+ (e-s)/ 2;

        //recursive relations
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr , target , s , m-1);
        }

        return search(arr , target , m+1 , e);

    }

    public static void main(String[] args){

        int[] arr={1,2,3,4,55,66,78};
        int target = 66 ;

        System.out.println(search(arr , target, 0 , arr.length-1));





    }
}
