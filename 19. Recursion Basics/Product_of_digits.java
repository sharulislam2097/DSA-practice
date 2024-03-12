public class Product_of_digits {
    public static void main(String[] args) {
        int n=55;
        System.out.println(prodOfDigit(n));

    }
    public static int prodOfDigit(int n){
        if(n%10==n){
            return n;
        }

        return (n%10) * prodOfDigit(n/10);
    }
}
