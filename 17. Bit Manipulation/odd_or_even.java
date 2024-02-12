public class odd_or_even {

    public static void evenorodd(int n){

        int bitmask =1 ; 
        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static void main(String[] args){

        evenorodd(3);
        evenorodd(16);
        evenorodd(9);

    }
    
}
