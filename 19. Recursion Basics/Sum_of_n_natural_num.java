public class Sum_of_n_natural_num {
    public static int sumOfNNatural(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNNatural(n-1);
    }
    public static void main(String[] args){
        int n=5;

        System.out.println(sumOfNNatural(n));

    }
}
