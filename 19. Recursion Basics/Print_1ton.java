//problem no 2
public class Print_1ton {
    public static void printIncreasing(int n){
       if(n==1){
           System.out.print(1+" ");
           return;
       }
       printIncreasing(n-1);
        System.out.print(n+" ");


    }


    public static void main(String[] args){
        int n=10;
        printIncreasing(n);
    }
}
