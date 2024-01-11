import java.util.*;

public class V_Comparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char op;

        a = sc.nextInt();
        op = sc.next().charAt(0);
        b = sc.nextInt();

        sc.close();

        switch (op) {
            case '=':
                if (a == b) {
                    System.out.println("Right");
                } else {
                    System.out.println("Wrong");
                }

                break;

            case '>':
                if (a > b) {
                    System.out.println("Right");
                } else {
                    System.out.println("Wrong");
                }

                break;

            case '<':
                if (a < b) {
                    System.out.println("Right");
                } else {
                    System.out.println("Wrong");
                }

                break;

        }

    }
}