// printing sub array max sum using prefix sum technique
public class max_subarraysum2 {

    public static void maxsubarraysum(int numbers[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        // declaring prefix sum array
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("max sum is:" + maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        maxsubarraysum(numbers);

    }
}