import java.util.*;
public class B_Basic_Data_Types {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int  n=sc.nextInt();
        long lg=sc.nextLong();
        char c = sc.next().charAt(0);
        float f=sc.nextFloat();
        double d=sc.nextDouble();

        System.out.println(n);
        System.out.println(lg);
        System.out.println(c);
        System.out.println(f);
        System.out.printf("%.1f",d);

        sc.close();
        
    }
}