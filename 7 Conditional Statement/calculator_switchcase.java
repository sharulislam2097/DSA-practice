import java.util.*;

public class calculator_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * no 1 -addition
         * no 2 -subtraction
         * no 3-multiplication
         * no 4-division
         */
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter your second number : ");
        int num2 = sc.nextInt();
        System.out.println("enter operation number : ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("enter correct operation");
        }

        sc.close();
    }
}
