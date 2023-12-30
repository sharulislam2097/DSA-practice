import java.util.*;
public class while_loop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i=1;
        int sum=0;
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
           
            i++;
        }
         System.out.println("Sum is:"+sum);

         sc.close();
    }
}
