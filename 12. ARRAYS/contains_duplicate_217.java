import java.util.HashSet;

public class contains_duplicate_217 {
    public static boolean containsduplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsduplicate(nums));
    }
}
