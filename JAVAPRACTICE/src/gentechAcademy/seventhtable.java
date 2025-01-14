package gentechAcademy;

class resultof7table {
    int[] table1() {
        int[] results = new int[10]; 
        for (int i = 1; i <= 10; i++) {
            results[i - 1] = 7 * i; 
        }
        return results; 
    }
}

public class seventhtable {
    public static void main(String[] args) {
        resultof7table t1 = new resultof7table();
        int[] res = t1.table1(); 

        
        for (int i = 0; i < res.length; i++) {
            System.out.println("7 x " + (i + 1) + " = " + res[i]);
        }
    }
}
