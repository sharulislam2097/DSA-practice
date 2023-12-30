public class butterfly {
    
    public static void butterfly_pattern(int n){


        //FIRST HALF outer loop /lines of row

        for(int i=1 ; i<=n ; i++){
            //iner content to print 
            
            //print star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //print spaces 
            for(int j=1 ; j<=((n-i)*2) ; j++){
                System.out.print(" ");
            }
            //again print star in the last portion
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println();
            

        }

        for(int i=n ; i>=1 ; i--){

            //iner content to print 
            
            //print star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //print spaces 
            for(int j=1 ; j<=((n-i)*2) ; j++){
                System.out.print(" ");
            }
            //again print star in the last portion
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        
    }

    public static void main(String[] args){

        butterfly_pattern(4);
    }
}
