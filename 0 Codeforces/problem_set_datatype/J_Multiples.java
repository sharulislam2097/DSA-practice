import java.util.*;

public class J_Multiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        sc.close();

        if ((A % B == 0) || (B % A == 0)) {
            System.out.println("Multiples");

        } else {
            System.out.println("No Multiples");
        }
    }
}