import java.util.Scanner;

public class maximum_in_matrix {
     // function to find maximum num among this 2d array
    public static int findmax(int arr2d[][], int n, int m) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                maximum = Math.max(maximum, arr2d[i][j]);

            }
        }

        return maximum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr2d[][] = new int[3][3];
        int n = arr2d.length, m = arr2d[0].length;

        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        System.err.println(findmax(arr2d, n, m));
    }

}
