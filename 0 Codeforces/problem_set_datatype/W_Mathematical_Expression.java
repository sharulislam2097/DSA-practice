import java.util.*;

public class W_Mathematical_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();
        char Q = sc.next().charAt(0);
        int C = sc.nextInt();
        sc.close();

        switch (S) {
            case '+':
                if (A + B == C) {
                    System.out.println("Yes");

                } else {
                    System.out.println(A + B);
                }

                break;

            case '-':
                if (A - B == C) {
                    System.out.println("Yes");
                } else {
                    System.out.println(A - B);
                }

                break;

            case '*':
                if (A * B == C) {
                    System.out.println("Yes");
                } else {
                    System.out.println(A * B);
                }

                break;

            case '/':
                if (A / B == C) {
                    System.out.println("Yes");
                } else {
                    System.out.println(A / B);
                }
                break;

            default:
                break;
        }

    }
}