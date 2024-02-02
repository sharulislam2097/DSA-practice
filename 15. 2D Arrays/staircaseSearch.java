public class staircaseSearch {
    public static boolean stairCaseSearch(int matrix[][] ,int key){
        // this code is for Left Bottom Special Index position
        int row= matrix.length-1, col =0;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Key not found");
        return false;

    }
    public static void main(String[] args){
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 40;

        stairCaseSearch(matrix, key);

    }
}
