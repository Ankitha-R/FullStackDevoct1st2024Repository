package gentechAcademy;

class DivisibleBy3 {

  
    void printDivisibleBy3() {
    	
        int count=0;
        for (int i = 40; i <= 80; i++) 
        {
            if (i % 3 == 0) 
            { 
                count++; 
            }
        }
        System.out.println(count); 
    }
}

public class DivisibleByTenExample {

    public static void main(String[] args) {
        
        DivisibleBy3 divisibleBy3 = new DivisibleBy3();
         divisibleBy3.printDivisibleBy3();
    }
}
