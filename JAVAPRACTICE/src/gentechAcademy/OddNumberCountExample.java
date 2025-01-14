package gentechAcademy;

class OddNumberCounter {

   
    int countOddNumbers() {
        int count = 0; 
        
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0) { 
                count++; 
            }
        }

        return count; 
    }
}

public class OddNumberCountExample {

    public static void main(String[] args) {
        
        OddNumberCounter counter = new OddNumberCounter();
        
       
        int oddCount = counter.countOddNumbers();
        
        
        System.out.println("Count of odd numbers between 1 and 500: " + oddCount);
    }
}
