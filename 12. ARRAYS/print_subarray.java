public class print_subarray {

    public static void printsubarrays(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];

                }
                System.out.println("=" + sum);

                if (sum < min) {
                    min = sum;
                } else if (sum > max) {
                    max = sum;
                }

            }
            System.out.print("min val:" + min + " max val:" + max);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printsubarrays(numbers);
    }
}
