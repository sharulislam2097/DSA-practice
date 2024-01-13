import java.util.*;

public class U_Float_or_int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int numInt = (int) num;
        double rest = num - numInt;

        if (rest != 0) {
            // System.out.print("float " + numInt + " ");
            System.out.printf("float " + numInt + " "+"%.3f",rest);
            // System.out.format("%.3f", rest);

        } else {
            System.out.println("int " + numInt);
        }

        sc.close();
    }
}