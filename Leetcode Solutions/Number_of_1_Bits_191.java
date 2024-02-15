public class Number_of_1_Bits_191 {

    // question level easy 
    public static int hammingWeight(long n){

        int count = 0;

        while(n!=0) {
            if ((n & 1) == 1) {
                count++;
            }

            n >>= 1;
        }
        
        return count;

    }
    public static void main(String[] args){

        System.out.println(hammingWeight(11));

    }
}