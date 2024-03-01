public class Tiling_problem {

    public static int tilingProblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
//        //for vertical placment
//        int vertical = tilingProblem(n-1);
//        // for horizontal placement
//        int horizonal = tilingProblem(n-2);
//
//        int totalways = vertical+horizonal;
//        return totalways;
        return tilingProblem(n-1)+tilingProblem(n-2);

    }
    public static void main(String[] args){

        System.out.println(tilingProblem(5));

    }
}