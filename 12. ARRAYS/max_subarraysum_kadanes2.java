public class max_subarraysum_kadanes2 {
    public static void kadanes(int nums[]) {

        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int maxNegative = Integer.MIN_VALUE; // Track the highest negative value

        for (int i = 0; i < nums.length; i++) {
            cursum = cursum + nums[i];

            maxsum = Math.max(cursum, maxsum);

            if (cursum < 0) {
                cursum = 0;
            }

            // Update maxNegative if the current element is a higher negative value
            maxNegative = Math.max(maxNegative, nums[i]);
        }

        // If maxsum is still negative, return the highest negative value
        if (maxsum < 0) {
            System.out.println(maxNegative);
        } else {
            System.out.println(maxsum); 
        }
    }

    public static void main(String[] args) {
        int nums[] = {-1, -2, -3, -4, -5};
        kadanes(nums);
    }
}
