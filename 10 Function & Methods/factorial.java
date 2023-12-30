import java.util.*;
public class factorial {

    public static int factorials(int n){
        int f=1 ;
        for(int i=1 ; i<=n; i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        int fact=factorials(n);

        System.out.println("factorial of n is:"+fact);

        sc.close();

    }



}
