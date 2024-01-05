import java.util.*;

public class O_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();

        sc.close();

        if (S == '+') {
            System.out.println(A + B);
        } else if (S == '-') {
            System.out.println(A - B);
        } else if (S == '*') {
            System.out.println(A * B);
        } else if (S == '/') {
            System.out.println(A / B);
        }

    }

}
