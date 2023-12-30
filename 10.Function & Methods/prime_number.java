public class prime_number {

    // public static boolean isPrime(int n){
    //     for(int i=2 ; i<=n-1 ; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
    
    
    public static void main(String[] args){
       

        System.out.println( isPrime(7));
    }
}
