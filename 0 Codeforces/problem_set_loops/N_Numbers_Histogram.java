import java.util.*;

public class N_Numbers_Histogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);
        int nums = sc.nextInt();

        for (int i = 1; i <= nums; i++) {
            int num = sc.nextInt();

            for (int j = 1; j <= num; j++) {
                System.out.print(s);
            }

            System.out.println();
        }

        sc.close();

    }
}