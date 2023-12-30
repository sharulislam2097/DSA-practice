import java.util.*;
public class p_product_ab {

    public static int multiply(int a, int b){
        int mul = a*b; 
        System.out.println("multiplication is :"+mul);

        return mul;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        multiply(a, b);
        sc.close();
    }
}
