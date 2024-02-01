public class diagonal_sum {
    public static int diagonalSum(int matrix[][]) {

        int sum = 0;
        // O(n^2) solution ;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         // pimary diagonal
        //         if (i == j) {
        //             sum += matrix[i][j];
                    
        //         }    //secondary diagonal
        //          else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];

        //         }

        //     }

        // }


       // O(n) solution ; 
        for(int i=0 ; i<matrix.length; i++){
            //pd 
            sum += matrix[i][i];
            //j = matrix.length-1-i;

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(diagonalSum(matrix));
    }

}
