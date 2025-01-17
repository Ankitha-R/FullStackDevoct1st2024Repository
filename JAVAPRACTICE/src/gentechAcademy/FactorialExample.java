package gentechAcademy;

public class FactorialExample {

   
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        int number = 5; 
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
