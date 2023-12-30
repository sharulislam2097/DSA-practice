import java.util.*;
public class inverted_star {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int r=1 ; r<=n  ;r++){
            for(int c=1 ; c<=(n+1-r) ; c++ ){
                System.out.print("*");
            }
            System.out.println();
        }






        sc.close();
    }
}
