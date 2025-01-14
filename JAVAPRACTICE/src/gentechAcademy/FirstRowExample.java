package gentechAcademy;

class ArrayOperations {
    
   
    byte[] getFirstRow(byte[][] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }
        return array[0]; 
    }
}

public class FirstRowExample {

    public static void main(String[] args) {
       
        byte[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       
        ArrayOperations operations = new ArrayOperations();
        
        
        byte[] firstRow = operations.getFirstRow(matrix);
        
        
        System.out.print("First row: ");
        for (byte value : firstRow) {
            System.out.print(value + " ");
        }
    }
}
