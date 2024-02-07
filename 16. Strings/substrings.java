public class substrings {

    public static String subString(String str , int si , int ei ){

        String substr = "";

        for(int i=si ; i<ei ; i++){
            substr += str.charAt(i);
        }

        return substr;
    }



    public static void main(String[] args){
        String str = "HelloWorld";
        int si =3 , ei =6; 

        System.out.println(subString(str, si, ei));

        // using of substring function in java

        System.out.println(str.substring(0,5));
    }
    
}
