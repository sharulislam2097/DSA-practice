import java.util.*;

public class V_PUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.print(counter + " ");

                counter++;
            }
            System.out.print("PUM");
            System.out.println();
            counter++;
        }

    }
}