import java.util.*;

public class L_GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = a, n2 = b, rem;

        while (n2 != 0) {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        System.out.println(n1);

    }
}