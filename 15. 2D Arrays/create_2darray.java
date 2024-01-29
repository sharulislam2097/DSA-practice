import java.util.*;

public class create_2darray {

    // function to find a key ar [i][j] cell
    public static boolean search(int matrix[][], int key, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("found ar cell " + i + "," + j);
                    return true;
                }
            }
        }

        System.out.println("key not found");
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = 6;

        // create 2d array ;

        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) { // traverse row
            for (int j = 0; j < m; j++) { // traverse cols
                matrix[i][j] = sc.nextInt();
            }
        }

        // print 2d array
        for (int i = 0; i < n; i++) { // traverse row
            for (int j = 0; j < m; j++) { // traverse cols
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, key, n, m);
        sc.close();

    }
}