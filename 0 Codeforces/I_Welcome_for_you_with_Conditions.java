import java.util.*;

public class I_Welcome_for_you_with_Conditions {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B=sc.nextInt();

        sc.close();

        if(A>=B){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}