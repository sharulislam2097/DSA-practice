import java.util.*;

public class T_Sort_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        sc.close();

        if (x <= y && y <= z) {
            System.out.print(x + "\n" + y + "\n" + z);
        } else if (x <= z && z <= y) {
            System.out.print(x + "\n" + z + "\n" + y);
        } else if (y <= z && z <= x) {
            System.out.print(y + "\n" + z + "\n" + x);
        } else if (y <= x && x <= z) {
            System.out.print(y + "\n" + x + "\n" + z);
        } else if (z <= x && x < y) {
            System.out.print(z + "\n" + x + "\n" + y);
        } else if (z <= y && y <= x) {
            System.out.print(z + "\n" + y + "\n" + x);
        }

        System.out.println();
        System.out.println();

        System.out.print(x + "\n" + y + "\n" + z);

    }
}
