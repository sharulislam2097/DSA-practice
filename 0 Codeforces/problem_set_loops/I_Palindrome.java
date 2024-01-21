import java.util.*;

public class I_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.close();

        int temp =n;

        int rev = 0, digit;

        while (temp > 0) {
            digit = temp % 10;
            rev = (rev * 10) + digit;

            temp = temp / 10;

        }
        if (rev == n) {
            System.out.println(rev);
            System.out.println("YES");
        } else{
            System.out.println(rev);
            System.out.println("NO");
        }

    }
}