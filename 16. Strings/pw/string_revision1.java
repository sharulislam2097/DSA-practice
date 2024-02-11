public class string_revision1 {

    public static void main(String[] args){ 
        String brand = "Denvar";
        System.out.println(brand);
        brand.concat("bangladesh");
        System.out.println(brand);

        StringBuilder brand2 = new StringBuilder("Denvar");
        System.out.println(brand2);
        brand2.append("Bangladesh2");
        System.out.println(brand2); 

        char [] ch ={'p','r','o','g','r','a','m','m','e','r'};

        String name = new String(ch);

        System.out.println(name);

        String str1 ="sharul";
        String str2 ="sharul";
        String str3 = new String("sharulislam");
        String str4 = new String("sharulislam");

        System.out.println(str1==str2);
        System.out.println(str3==str4);


       
    }
    
}
