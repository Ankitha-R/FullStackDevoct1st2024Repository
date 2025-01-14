package gentechAcademy;

public class BooleanArrayExample {
    
    public boolean[] createBooleanArray(int size) {
        boolean[] arr = new boolean[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (i % 2 == 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        BooleanArrayExample example = new BooleanArrayExample();
        boolean[] result = example.createBooleanArray(10);
        
        for (boolean value : result) {
            System.out.print(value + " ");
        }
    }
}

