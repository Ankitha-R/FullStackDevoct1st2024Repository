public class SumOfSquares1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i * i; // Add the square of the current number to the sum
        }

        System.out.println("The sum of squares of numbers from 1 to 10 is: " + sum);
    }
}

