import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius value: ");
        float rad = sc.nextFloat();

        float area = 3.1416f * rad * rad;

        System.out.println("area is : " + area);
        sc.close();

    }
}
