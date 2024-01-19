import java.util.*;

public class S_Sum_of_Consecutive_Odd_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;

            if (x > y) {
                int temp = 0;
                temp = x;
                x = y;
                y = temp;

            }
            for (int j = x + 1; j < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }

            }
            System.out.println(sum);

        }

    }
}