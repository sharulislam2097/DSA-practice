import java.util.Scanner;

public class K_Max_and_Min {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int minimum = 0;
        int maximum = 0;

        if (A < B && A < C) {
            minimum = A;

        } else if (B < A && B < C) {
            minimum = B;

        } else {
            minimum = C;

        }
        System.out.print(minimum + " ");

        if ((A > B) && (A > C) && (A != minimum)) {
            maximum = A;

        } else if ((B > A) && (B > C) && (B != minimum)) {
            maximum = B;

        } else if (C != minimum) {
            maximum = C;

        }

        System.out.print(maximum);
    }
}