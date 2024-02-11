public class reverse_string3 {

    public static void main(String[] args){
        String str1 ="java skills";
        String str2 ="";

        String arr[] = str1.split(" ");
        for(String element :arr){
            for(int i=element.length()-1 ; i>=0 ; i--){
                str2 = str2+element.charAt(i);
            }
            str2= str2+" ";
            
        }
        System.out.print(str2);
    }
    
}
