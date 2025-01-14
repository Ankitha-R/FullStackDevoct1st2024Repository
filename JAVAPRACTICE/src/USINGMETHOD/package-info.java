package USINGMETHOD;
public class Main {

    // Function to multiply the second half of the array elements
    public static int multiplySecondHalf(int[] arr) {
        // Find the length of the array
        int n = arr.length;
        
        // Start from the middle element and multiply the second half
        int result = 1;
        for (int i = n / 2; i < n; i++) {
            result *= arr[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 5, 7};
        
        // Call the function to get the multiplication result of the second half
        int result = multiplySecondHalf(arr);
        
        // Print the result
        System.out.println("Multiplication result of the second half: " + result);
    }
}
