import java.util.*;

public class sum_of_a_b_from_user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number b: ");
        int b = sc.nextInt();

        int sum = a + b;
        int pro= a*b; 

        System.out.println("sum is " + sum);
        System.out.println("Product of : "+pro);


        sc.close();

    }

}
