import java.util.*;
public class check_prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

       
        boolean isPrime= true; 
        if(n==2){
            System.out.println("n is a prime number ");
        }
        else{
            for(int i=2 ; i<=n-1; i++){

                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is a prime number ");
            }
            else{
                System.out.println("n is not prime number");
            }
        }



        sc.close();
    }
}
