import java.util.*;
public class Saydigit {
    public static void say_digit(int n, String arr[]){
        //base case
        if(n==0){
            return;
        }
        // processing
        int digit = n%10;
        n = n/10;



        //recursive call
        say_digit(n , arr);
        System.out.print(arr[digit]+" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        say_digit(n , arr);


    }
}
