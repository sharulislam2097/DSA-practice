public class practice_problem2 {

    public static void main(String[] args){
        int matrix [][]={{1,4,9},{11,4,3},{2,2,3}};

        for(int i=0 ; i<matrix.length; i++){
            for(int j=0 ; j<matrix.length; j++){
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum =0 ;
        for(int j=0 ; j<matrix.length; j++){
            sum += matrix[1][j];
        }
        System.out.println(sum);

    }
}