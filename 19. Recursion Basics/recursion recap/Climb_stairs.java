//Problem statement
//You have been given a number of stairs. Initially, you are at the 0th stair, and you need to reach the Nth stair.
//
//
//
//Each time, you can climb either one step or two steps.
//
//
//
//You are supposed to return the number of distinct ways you can climb from the 0th step to the Nth step.
public class Climb_stairs {
    public static long countDistinctWayToClimbStair(int nStairs) {
        // Base case
        if(nStairs < 0){
            return 0;

        }
        if(nStairs==0){
            return 1;

        }

        long ans = countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2);

        return ans;
    }
    public static void main(String[] args){
        int nStairs=5;

        System.out.println(countDistinctWayToClimbStair(nStairs));
    }
}
