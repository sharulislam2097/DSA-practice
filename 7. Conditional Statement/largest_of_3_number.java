import java.util.*;
public class largest_of_3_number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int A= sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is greater among 2");
}
        
        else if(B>A && B>C){
            System.out.println("B is greater among 2");
        }
        else{
            System.out.println("C is greater among 2");
        }
        sc.close();
    }
}
