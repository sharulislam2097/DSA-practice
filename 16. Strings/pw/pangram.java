public class pangram {

    public static void main(String[] args) {

        boolean flag = true;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        str = str.replace(" ", "");
        char[] ch = str.toCharArray();

        int ar[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            ar[ch[i] - 65]++;
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                flag = false;
                System.out.println("its not pangram");

            }
        }

        if (flag == true) {
            System.out.println("it is a pangram");
        }
    }

}
