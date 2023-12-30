import java.util.*;
public class function_with_parameter {

    public static int calculateSum(int a, int b){ //parameters or formal parameter

        int sum = a+b ;
        System.out.println("sum is : "+sum);

        return sum;
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        calculateSum(a, b); //arguments or actual parameter

        sc.close();

    }

   
    
}
