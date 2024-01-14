public class max_subarraysum1 {
    public static void maxsubarraysum(int numbers[]){

        int cursum =0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0 ; i<numbers.length; i++){
            int start=i;
            for(int j=i ; j<numbers.length; j++){
                int end = j;
                cursum=0;
                for(int k=start ;k<=end; k++){
                    // System.out.print(numbers[k]+" ");
                    cursum+=numbers[k];
                }
                System.out.println("="+cursum);
                if(maxsum<cursum){
                    maxsum=cursum;
                } 
                
            }
            System.out.println();
        }
        System.out.println("maximum sum :"+maxsum); 
    }
    public static void main(String[] args){
        int numbers[]={1,-2,6,-1,3};

        maxsubarraysum(numbers);
    }
}
