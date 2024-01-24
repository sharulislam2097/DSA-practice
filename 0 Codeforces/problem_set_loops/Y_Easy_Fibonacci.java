import java.util.*;

public class Y_Easy_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int firstnum = 0, secondnum = 1;
        int nextnum;
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(firstnum + " ");
            nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }

    }
}