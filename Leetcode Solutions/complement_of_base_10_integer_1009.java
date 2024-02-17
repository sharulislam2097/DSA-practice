public class complement_of_base_10_integer_1009 {

    public static int complimentofn(int n ){
        int m=n ; 
        int mask =0 ;

        if(n==0){
            return 1;
        }

        while( m!=0){
            mask=(mask<<1)|1;

            m = m>>1;
        }
        int ans = (~n) & mask;

        return ans;
    }

    public static void main(String[] args){
        System.out.println(complimentofn(5));
    }
}