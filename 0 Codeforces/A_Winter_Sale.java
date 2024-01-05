import java.util.Scanner;

public class A_Winter_Sale{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int x = scanner.nextInt();
        int p = scanner.nextInt();

        scanner.close();

        // Output
        double result = calculateOriginalPrice(x, p);
        System.out.printf("%.2f\n", result);
    }

    private static double calculateOriginalPrice(int x, int p) {
        double discountedPrice = p;
        double originalPrice = discountedPrice / ((100.0 - x) / 100.0);
        return Math.round(originalPrice * 100.0) / 100.0;
    }
}
