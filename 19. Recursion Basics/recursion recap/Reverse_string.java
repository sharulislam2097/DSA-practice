public class Reverse_string {

    public static String reverseString(String str, int i, int j) {
        // base case
        if (i > j) {
            return str;
        }
        // convert string to char array then swap i index value with j index value
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        //recursive call

        return reverseString(String.valueOf(charArray), i + 1, j - 1);
    }

    public static void main(String[] args) {
        String name = "sharul";

        String reversed = reverseString(name, 0, name.length() - 1);

        System.out.println(reversed);

    }

}