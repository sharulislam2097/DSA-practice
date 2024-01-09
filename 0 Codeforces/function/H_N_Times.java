import java.util.Scanner;

public class H_N_Times {

    public static void n_times(int t, Scanner scn) {
        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();
            char c = scn.next().charAt(0);
            for (int j = 1; j <= n; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        n_times(t, scn);

        scn.close();
    }
}
