import java.util.*;

public class P_First_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        sc.close();

        int firstDigit = 0;

        while (X != 0) {
            firstDigit = Math.abs(X % 10);
            X /= 10;
        }

        if (firstDigit % 2 == 0) {
            System.out.println("EVEN");

        } else {
            System.out.println("ODD");
        }
    }
}