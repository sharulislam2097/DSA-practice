public class ith_bit_operations {

    // get ith bit
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    // set ith bit
    public static int setBit(int n , int i){
        int bitMask = 1 <<i;
        return n|bitMask;
    }

    // clean ith bit 
    public static int clearithBit(int n , int i){
        int bitmask = ~(1<<i);

        return n & bitmask;
    }

    //update ith bit

    public static int updateIthBit(int n, int i , int newBit){

        if(newBit == 0){
           return  clearithBit(n, i);
        }else{
           return setBit(n, i);
        }

    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 3));

        System.out.println(setBit(10, 2));

        System.out.println(clearithBit(10,1));

        System.out.println(updateIthBit(10, 2, 1));


    }

}
