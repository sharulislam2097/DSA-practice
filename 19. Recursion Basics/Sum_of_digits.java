public class Sum_of_digits {
    public static void main(String[] args){
        int n=1342;
        System.out.println(sumofdigits(n));

    }

    public static int sumofdigits(int n){
        if(n==1){
            return 1;
        }

        return (n%10) + sumofdigits(n/10);
    }
}
