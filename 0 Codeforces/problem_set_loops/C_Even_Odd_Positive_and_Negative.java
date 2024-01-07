import java.util.*;

public class C_Even_Odd_Positive_and_Negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a;
        int even = 0, odd = 0, pos = 0, neg = 0;

        for (int i = 1; i <= N; i++) {

            a = sc.nextInt();

            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (a > 0) {
                pos++;
            } else if (a < 0) {

                neg++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);

        sc.close();
    }
}