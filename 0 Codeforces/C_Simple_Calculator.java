import java.util.Scanner;

public class C_Simple_Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long Y = sc.nextLong();

        sc.close();

        long summation = X + Y;
        long multiplication = X * Y;
        long subtraction = X - Y;

        System.out.println(X + " + " + Y + " = " + summation);
        System.out.println(X + " * " + Y + " = " + multiplication);
        System.out.println(X + " - " + Y + " = " + subtraction);

    }
}