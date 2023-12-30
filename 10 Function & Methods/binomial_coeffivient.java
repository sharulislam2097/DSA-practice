public class binomial_coeffivient {
    //helper factorial calculator
    public static int factorials(int n){
        int f=1 ;
        for(int i=1 ; i<=n; i++){
            f=f*i;
        }
        return f;
    }

    public static int binomialcoeffivient(int n , int r){
        int n_fact = factorials(n);
        int r_fact = factorials(r);
        int nr_fact= factorials(n-r);

        int binco= n_fact/ (r_fact * nr_fact);

        return binco;
    }

    public static void main(String[] args){

        System.out.println(binomialcoeffivient(5, 2));

    }

}
