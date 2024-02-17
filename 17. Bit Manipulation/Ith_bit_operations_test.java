public class Ith_bit_operations_test {

    // find ith bit in binary 
    public static int findIthBit(int n , int i){

        int bitmask = 1<<i;
        if((n & bitmask) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        // find ith bit
        System.out.println(findIthBit(15, 5));

        // set ith bit ; 



       
    }
    
}
