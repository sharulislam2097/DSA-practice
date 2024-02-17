public class Search_a_2d_matrix_74 {

    
        public static boolean searchMatrix(int[][] matrix, int target) {
             if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            int start = 0;
            int end = rows * cols - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int midVal = matrix[mid / cols][mid % cols];
                
                if (midVal == target) {
                    return true;
                } else if (midVal < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
            return false;
        }

        public static void main(String[] args) {
            int target =3 ;
            int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

           System.out.println(searchMatrix(matrix, target));
        }
    }
    

