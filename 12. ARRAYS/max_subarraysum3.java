public class max_subarraysum3 {
    public static void maxsubarraysum3(int nums[]){

        // int currentSum =0 ;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length; i++){
            int sum =0;
            for(int j=i ; j<nums.length; j++){
                sum = sum+nums[j];
            }

            if(maxsum<sum){
                maxsum=sum;
            }

            System.out.println("="+sum);
        }
        System.out.println("max sum among all subarrays:"+maxsum);

    }
    public static void main(String[] args){
        int nums[]={1,-2,6,-1,3};
        maxsubarraysum3(nums);

    }
    
}
