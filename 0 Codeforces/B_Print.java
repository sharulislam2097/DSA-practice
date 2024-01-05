import java.util.*;
public class B_Print {

    public static void print(int n){

        for(int i=1 ; i<=n ; i++){
            System.out.print(i);
            if(i<n){
                System.out.print(" ");
            }
        }

        System.out.println();

    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        print(n);

        sc.close();

        
        
    }
    
}