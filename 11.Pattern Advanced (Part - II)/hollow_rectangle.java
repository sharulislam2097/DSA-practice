public class hollow_rectangle {
    public static void hollow_rectangles(int totRows, int totCols ){
        //outer / row loops
        for(int i=1 ; i<=totRows; i++){
            //inner columns 
            for(int j=1 ; j<=totCols ; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        hollow_rectangles(5, 10);
    }
}
