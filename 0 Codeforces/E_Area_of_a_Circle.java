import java.util.*;

public class E_Area_of_a_Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi= 3.141592653;

        double Area = pi * R * R;

        System.out.printf("%.9f",Area);

        sc.close();

    }

}