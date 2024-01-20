import java.util.*;

public class R_Sequence_of_Numbers_and_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n > 0 & m > 0) {
            int sum = 0;
            for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.print("sum =" + sum);

            System.out.println();

            n = sc.nextInt();
            m = sc.nextInt();

        }

        sc.close();

    }
}