public class inverted_half_pyramid_with_numbers {
    
    public static void inverted_half_pyramid_with_number(int n){

        //outer loops/ lines 
        for(int i=1 ; i<=n ; i++){
            //inner loop numbers 

            for(int j=1 ; j<=n-i+1; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        inverted_half_pyramid_with_number(5);
    }
}
