public class half_pyramid {

    public static void halfpyramid(int n){
        //outer loop / no of lines
        for(int i=1 ; i<=n ; i++){

            //inner loop column

            //spaces 
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

        System.out.println();

        }
    }

    public static void main(String[] args){
        halfpyramid(5);
    }
}