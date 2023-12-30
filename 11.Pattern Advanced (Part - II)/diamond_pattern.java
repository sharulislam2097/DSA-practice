public class diamond_pattern {
    public static void diamond_p(int n){
        // first half
        for(int i=1 ; i<=n ; i++){

            //space
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //second half
        for(int i=n ; i>=1 ; i--){

            //space
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        diamond_p(4);
    }
}
