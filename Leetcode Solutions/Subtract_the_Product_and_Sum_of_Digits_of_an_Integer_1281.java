public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {

    public static int subtractProductandSum(int n){

        int digit =0;
        int product =1 ;
        int sum =0 ;

        while(n>0){

            digit = n%10;
            product *= digit;
            sum += digit;

            n=n/10;


        }
        int subtract = product - sum;
       return subtract;
    }

    public static void main(String[] args) {


        System.out.println(subtractProductandSum(234));

    }

}