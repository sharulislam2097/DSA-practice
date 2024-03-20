public class ReachHome {
    public static void reachhome(int src , int dest){
        System.out.println("source:"+src+"destination:"+dest);

        if(src==dest){
            System.out.println("you finally reached home");
            return;
        }


         reachhome(src+1 , dest);

    }

    public static void main(String[] args){

        int src =1 ;
        int dest =10;

       reachhome(src , dest);

    }
}
