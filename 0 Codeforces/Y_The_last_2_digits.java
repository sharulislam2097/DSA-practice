import java.util.*;

public class Y_The_last_2_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        sc.close();

        A = A % 100;
        B = B % 100;
        C = C % 100;
        D = D % 100;

        int m = (A * B * C * D);
        int ls = m % 100;

        if (ls < 10) {
            System.out.print(ls);

        } else {
            System.out.print(ls);
        }

    }
}