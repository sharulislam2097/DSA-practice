public class x_to_the_power_n_optimal {
    public static int powerOptimize(int x , int n){

        if(n==0){
            return 1;
        }
        int halfpower =powerOptimize(x , n/2);
        int halfpowersq= halfpower *halfpower;

        //n is odd

        if(n%2 != 0){
            halfpowersq = x * halfpowersq;
        }

        return halfpowersq;

    }

    public static void main(String[] args) {

        System.out.println(powerOptimize(2,10));

    }
}
