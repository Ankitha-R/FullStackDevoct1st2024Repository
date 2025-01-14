 package gentech;

    public class DivisibleBySix {
        public static void main(String[] args) {
            int num = 5; 
            int factorial = 1;
            int i = 1;
            do {
                factorial *= i;
                i++;
            }
            while (i <= num);
            System.out.println("The factorial of " + num + " is: " + factorial);
            
            
            if (factorial % 6 == 0) {
                System.out.println("The factorial is divisible by 6.");
            } 
            else {
                System.out.println("The factorial is not divisible by 6.");
            }
        }
    }

		        
		        



