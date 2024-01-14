import java.util.*;

public class H_Two_numbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        sc.close();

        float div = (A / B);

        System.out.println("floor " + (int) A + " / " + (int) B + " = " + ((int) Math.floor(div)));
        System.out.println("ceil " + (int) A + " / " + (int) B + " = " + (int) Math.ceil(div));
        System.out.println("round " + (int) A + " / " + (int) B + " = " + (int) Math.round(div));

    }
}