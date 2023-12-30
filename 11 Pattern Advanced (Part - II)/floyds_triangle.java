public class floyds_triangle {

    public static void floyds_tri(int n){
         int num=1;
        for(int i=1 ; i<=n ; i++){
            //inner loop for each line what is going to print.
           
            for(int j=1 ; j<=i ;j++){
                
                System.out.print(num+" ");

                num++;
            }

            System.out.println();
        }

    }

    public static void main(String[] args){
        floyds_tri(5);
    }
}