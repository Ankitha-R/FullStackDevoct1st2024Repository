package gentechAcademy;

class evennumber {
    void geteven() {
        for (int i = 40; i >= 20; i--) {
            if (i % 2 == 0) {
                System.out.println(i); 
            }
        }
    }
}

public class sampledemo8 {

    public static void main(String[] args) {
        evennumber eve = new evennumber();
        System.out.println("Even numbers between 40 and 20:");
        eve.geteven(); 
    }
}
