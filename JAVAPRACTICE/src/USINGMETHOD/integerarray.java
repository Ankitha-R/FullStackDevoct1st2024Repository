package USINGMETHOD;

public class ArrayProcessor {
    private int[] arr;                                                         // Instance variable to hold the array

                                                                              // Constructor to initialize the array
    public ArrayProcessor(int[] arr) {
        this.arr = arr;
    }

                                                                              // Method to calculate the multiplication of the second half of the array
    public int multiplySecondHalf() {
        int n = arr.length;

                                                                              // Ensure there is at least one element in the array
        if (n == 0) {
            return 0;                                                         // If the array is empty, return 0
        }

                                                                    
        int result = 1;                                                      // Initialize the multiplication result to 1

       
        int startIndex = n / 2;                                             // Calculate the start index of the second half

        
        for (int i = startIndex; i < n; i++) {                              // Multiply the elements of the second half of the array
            result *= arr[i];
        }

        return result;                                                     // Return the multiplication result of the second half
    }

    public static void main(String[] args) {
                                                                           // Example input array
        int[] arr = {3, 5, 7};

                                                                          // Create an object of ArrayProcessor class
        ArrayProcessor processor = new ArrayProcessor(arr);

                                                                          // Call the method to calculate the product of the second half
        int result = processor.multiplySecondHalf();

                                                                         // Output the result
        System.out.println("Multiplication result of the second half: " + result);
    }
}







