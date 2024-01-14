import java.util.*;

public class R_Age_in_Days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        int y, m, d;

        y = N / 365;

        N = N % 365;
        m = N / 30;
        N = N % 30;
        d = N;

        System.out.println(y + " years");
        System.out.println(m + " months");
        System.out.println(d + " days");
    }

}