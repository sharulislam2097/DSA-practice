public class check_string_palindrome {

    public static boolean isPalindrome(String str){

        String lower = str.toLowerCase();
        for(int i=0 ; i<lower.length()/2 ; i++){
            int n = lower.length();

            if(lower.charAt(i) != lower.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(isPalindrome(str));

    }

}
