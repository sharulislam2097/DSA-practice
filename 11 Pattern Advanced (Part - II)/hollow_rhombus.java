public class hollow_rhombus {
    public static void hollow_rhom(int n){
        //outer loop
        for(int i=1 ; i<=n ; i++){
            //inner loop

            //space + star  in hollow shape

            // print space 
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            //hollow shape identifing boundaries 

            for(int j=1 ; j<=n ; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        hollow_rhom(5);
    }
}
