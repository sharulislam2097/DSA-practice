import java.util.*;
public class Check_prime_number {

//    public static boolean isPrime(int n){
//        if(n<1){
//            return false;
//        }
//        for(int i=2 ; i<n ; i++){
//            if((n%i)==0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(isPrime(n)){
//            System.out.println("its a prime number");
//        }
//        else{
//            System.out.println("it is not a prime number");
//        }
//    }


        public static int countPrimes(int n) {
            boolean[] notPrime = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (notPrime[i] == false) {
                    count++;
                    for (int j = 2; i*j < n; j++) {
                        notPrime[i*j] = true;
                    }
                }
            }

            return count;
        }

        public static void main(String[] args){
            int n=40;

            System.out.println(countPrimes(n));


        }

    }
