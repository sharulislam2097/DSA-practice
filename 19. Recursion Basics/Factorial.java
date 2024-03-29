
// problem no 3
import java.util.*;

public class Factorial {
    public static int solve(int n) {
        if (n == 0) {
            return 1;
        }

        return n * solve(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));

        sc.close();

    }

}
