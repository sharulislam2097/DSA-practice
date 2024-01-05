import java.util.*;

public class M_Capital_or_Small_or_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char X = sc.next().charAt(0);

        sc.close();

        if (Character.isDigit(X)) {
            System.out.println("IS DIGIT");

        } else if (Character.isUpperCase(X)) {
            System.out.print("ALPHA\nIS CAPITAL");
        } else if (Character.isLowerCase(X)) {
            System.out.print("ALPHA\nIS SMALL");
        }
    }
}