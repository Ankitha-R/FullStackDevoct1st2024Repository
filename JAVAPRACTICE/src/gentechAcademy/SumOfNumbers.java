package gentechAcademy;

public class SumOfNumbers {

   
    public int getSumOfFirstFiveNumbers() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i; 
        }
        return sum; 
    }

    public static void main(String[] args) {
        SumOfNumbers example = new SumOfNumbers();

        
        int result = example.getSumOfFirstFiveNumbers();

        
        System.out.println("The sum of the first five numbers is: " + result);
    }
}
