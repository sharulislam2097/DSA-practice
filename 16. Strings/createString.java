import java.util.*;

public class createString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Sharul";
        String name = sc.nextLine();

        System.out.println(name.length());

        // concatenation of string
        String firstname = "Sharul";
        String lastname = "Islam";

        String fullname = firstname + " " + lastname; 
        System.out.println(fullname);
    }
}