public class buyandsellstocks2 {
    public static int buynsellstocks(int prices[]){
        int maxProfit=0;
        int minsofar= prices[0];

        for(int i=0 ; i<prices.length; i++){
            minsofar = Math.min(minsofar , prices[i]);
            int profit = prices[i]-minsofar;
            maxProfit=Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        System.out.println(buynsellstocks(prices));
    }
}
