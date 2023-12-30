import java.util.*;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Hello!");
                break;

            case 2:
                System.out.println("good morning");
                break;

            case 3:
                System.out.println("Get lost from here");
                break;
            default:
                System.out.println("who are you?");
        }

        sc.close();

    }
}
