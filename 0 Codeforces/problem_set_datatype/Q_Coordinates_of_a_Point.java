import java.util.*;

public class Q_Coordinates_of_a_Point {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        sc.close();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");

        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}