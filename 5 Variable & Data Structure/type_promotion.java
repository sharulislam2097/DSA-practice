public class type_promotion {
    public static void main(String[] args){
        char a='a';
        char b='b';
        System.out.println(a+b);

        short h= 5;
        byte f= 25;
        char c= 'c';

        byte bt= (byte) (h+f+c);
        System.out.println(bt);
    }
}
