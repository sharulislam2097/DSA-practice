import java.util.*;

public class G_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();

            if (N == 0 ) {
                System.out.println("1");
            } else {
                long factorial = 1;
                for (int j = 1; j <= N; j++) {

                    factorial = factorial * j;

                }
                System.out.println(factorial);
            }

        }
        sc.close();
    }
}