import java.util.*;

public class Q_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int n = sc.nextInt();

            do {
                System.out.print(n % 10 + " ");
                n = n / 10;
            } while (n != 0);

            System.out.println(); 
        }

        sc.close();
    }
}