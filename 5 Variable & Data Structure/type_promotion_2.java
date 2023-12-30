public class type_promotion_2 {
    public static void main(String[] args){
        int a=15;
        float b=20.35f;
        long c=35;
        double d= 30.4343434343;

        double ans= a+b+c+d;
        System.out.println(ans);

        byte y=5;
        byte z=(byte)(y*2); 
        System.out.println(z);
    }
    
}
