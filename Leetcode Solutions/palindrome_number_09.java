public class palindrome_number_09 {

    public static boolean isPalindrome(int x) {
        long temp = x;
        long rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;

        }
        if (rev == temp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }
}