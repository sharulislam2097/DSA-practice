public class decToBin {
    public static void binToDec(int n){
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem= n%2;
            binNum = binNum +(rem*(int)Math.pow(10,pow));

            pow++;
            n=n/2;
        }
        System.out.println("binary :"+binNum);
    }

    public static void main(String[] args){
        binToDec(5);
    }
}
