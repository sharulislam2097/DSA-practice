public class max_subarraysum_kadanes {
    public static void kadanes(int nums[]){

        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0 ; i<nums.length; i++){
            cursum=cursum+nums[i];
            
            maxsum=Math.max(cursum, maxsum);

            if (cursum < 0) {
                cursum = 0;
            }
        }

        System.out.println(maxsum);

    }
    public static void main(String[] args){
        int nums[]={-1,-2,-3,-4,-5};
        kadanes(nums);
    }
}
