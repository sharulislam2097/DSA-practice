public class sumof_Ainterger {
    public static int sumofInt(int n){
        int sum =0 ;
        

        while(n>0){
            int lastDigit=n%10;
            sum = sum+lastDigit;

            n=n/10;
        }

        return sum;

    }

    public static void main(String[] args){
       int sumOfDigit =  sumofInt(3750);

       System.out.println("The sum of digit:"+sumOfDigit);

    }
}
