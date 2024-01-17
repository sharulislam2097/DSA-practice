import java.util.*;

public class J_Primes_from_1_to_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.close();
        

        for (int i = 2; i <= N; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }

    }
}