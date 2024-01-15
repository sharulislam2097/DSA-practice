import java.util.*;

public class Z_Hard_Compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        sc.close();

        System.out.println((b * Math.log(a)) > (d * Math.log(c)) ? "YES" : "NO");

    }
}