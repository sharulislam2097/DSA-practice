public class complement_of_base_10_integer_1009 {

    public static int complimentofn(int n ){
        int i=3 ; 
        int b = i<<i-1;

        System.out.println(b);

        if(n==0){
            return 0;
        }

        return (~n) |  b ;
    }

    public static void main(String[] args){
        System.out.println(complimentofn(5));
    }
}