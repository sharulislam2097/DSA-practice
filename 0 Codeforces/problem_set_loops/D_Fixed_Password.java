import java.util.*;

public class D_Fixed_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        while (true) {
            x = sc.nextInt();

            if (x == 1999) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }
        }

        sc.close();

    }
}