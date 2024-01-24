import java.util.*;
public class Z_Three_Numbers {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k =sc.nextInt();
        int s =sc.nextInt();
        int counter =0;

        for(int i=0; i<=k ; i++ ){
            for(int j=0 ; j<=k ; j++){
                if(s-i-j>=0 && s-i-j<=k){
                    counter ++;
                }
            }
        }
        System.out.println(counter);
    }
}