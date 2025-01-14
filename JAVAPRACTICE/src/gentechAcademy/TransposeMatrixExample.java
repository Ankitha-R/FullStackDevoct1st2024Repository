package gentechAcademy;

class MatrixOperations {
    
    
    int[][] transposeMatrix(int[][] matrix) {
       
        if (matrix == null || matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        
        int[][] transpose = new int[3][3]; 

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;     }
}

public class TransposeMatrixExample {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        MatrixOperations operations = new MatrixOperations();
        
       
        int[][] transpose = operations.transposeMatrix(matrix);
        
        
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
