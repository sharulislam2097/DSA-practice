public class pair_in_array {
    public static void printpairs(int numbers[]){
        int pair =0;
        for(int i=0 ; i<numbers.length; i++){
            int curr = numbers[i];

            for(int j=i+1 ; j<numbers.length ; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                pair++;
            }
            System.out.println();
        }
        System.out.println("total number of pair:"+pair);
        

    }
    public static void main(String[] args){ 
        int numbers[]={2,4,6,8,10};

        printpairs(numbers);
    }
}
