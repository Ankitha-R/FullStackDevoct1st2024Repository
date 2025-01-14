package gentechAcademy;

public class AverageCalculator {
	 public static double calculateAverage() {
	        int sum = 0;
	        for (int i = 1; i <= 10; i++) {
	            sum += i;
	        }
	        return sum / 10.0;
	    }

	    public static void main(String[] args) {
	        System.out.println(calculateAverage());
	    }
	

}
