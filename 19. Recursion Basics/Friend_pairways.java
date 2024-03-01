public class Friend_pairways {
    public static int friendParing(int n){
        if(n==1 || n==2){
            return n;
        }

        //single
        int single = friendParing(n-1);
        //pair
        int paring = friendParing(n-2);
        int pairways = (n-1)* paring;

        int totalWays = single + pairways;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendParing(3));
    }

}
