import java.util.*;
public class F_Digits_Summation {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        long N=sc.nextLong();
        long M=sc.nextLong();

        long lastofN=N%10;
        long lastofM=M%10;

        System.out.println(lastofN+lastofM);

        sc.close();

    }
}