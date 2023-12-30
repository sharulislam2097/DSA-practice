public class solid_rhombuspatter {
    
    public static void solidRhombus(int n){
        //outer loop/ how many lines will be printed
        for(int i=1 ; i<=n ; i++){
            //inner loop  space +star

            //print spaces 
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //print star 
            for(int j=1 ; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();


        }
    }

    public static void main(String[] args) {
        solidRhombus(7);
    }
}
