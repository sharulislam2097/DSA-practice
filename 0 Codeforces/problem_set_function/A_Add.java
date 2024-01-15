import java.util.*;

public class A_Add {

    public static int addnum(int a, int b) { 
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt( );

        System.out.println(addnum(a, b));

        sc.close();
    }
}