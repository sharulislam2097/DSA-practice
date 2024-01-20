import java.util.*;

public class F_Multiplication_table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }

        sc.close(); 
        
    }

}