import java.util.*;

public class X_Two_intervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        sc.close();

        if (Math.max(l1, l2) > Math.min(r1, r2)) {
            System.out.println("-1");
        } else {
            System.out.println(Math.max(l1, l2) + " " + Math.min(r1, r2));
        }

    }
}