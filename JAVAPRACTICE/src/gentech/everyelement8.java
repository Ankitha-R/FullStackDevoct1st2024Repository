package gentech;

public class everyelement8 {

    public static void main(String[] args) {
        String[] arr = {"ankitha", "ram", "sushma", "vidya", "hithaishi", "apoorva"};
        
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]); 
            }
        }
    }
}
