import java.util.*;

public class createString {

    public static void printallLetter(String str){
        for(int i=0 ; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Concatenation";
        String name = sc.nextLine();

        System.out.println(name.length());

        // concatenation of string
        String firstname = "Shejaan";
        String lastname = "Araff";

        String fullname = firstname + " " + lastname; 
        System.out.println(fullname);

        //  extract every character at index 
        System.out.println(fullname.charAt(1));

        printallLetter(str);

        sc.close();
    }
}