import java.util.*;

public class H_One_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        } 

        sc.close();

    }
}
