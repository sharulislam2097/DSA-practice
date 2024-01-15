import java.util.*;

public class E_Swap {

    public static void swapnum(int x, int y) { 

        int temp = x;
        x = y;
        y = temp;

        System.out.println(x + " " + y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        swapnum(x, y);

        sc.close();
    }
}