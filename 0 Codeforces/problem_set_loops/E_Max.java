import java.util.*;

public class E_Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();  

            if (a > max) {
                max = a;
            }
        }

        System.out.println(max);

        sc.close();
    }
}