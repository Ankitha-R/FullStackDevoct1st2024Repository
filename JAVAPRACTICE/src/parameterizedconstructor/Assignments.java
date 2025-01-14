package parameterizedconstructor;

class PrimeSum 
{
    void primenos() 
    {
        int sum = 0;
        for (int i = 1; i <= 100; i++) 
        {
            int count = 0;
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

public class Assignments 
    {
    public static void main(String args[]) 
    {
        PrimeSum p1 = new PrimeSum();
        p1.primenos();
    }
}
