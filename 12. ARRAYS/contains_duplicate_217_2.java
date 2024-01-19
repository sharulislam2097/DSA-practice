
public class contains_duplicate_217_2 {
    // brute force solution of contains any duplicate value in array
    public static boolean contains_duplicate(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println(contains_duplicate(nums));

    }
}
