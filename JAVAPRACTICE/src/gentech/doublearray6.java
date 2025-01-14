package gentech;

public class doublearray6 {
    public static void main(String[] args) 
    {
       
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println("Elements excluding the first and last:");
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

t