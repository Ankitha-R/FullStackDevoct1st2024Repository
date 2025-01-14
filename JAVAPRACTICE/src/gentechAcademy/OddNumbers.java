package gentechAcademy;


public class OddNumbers {
    public static int[] getFirstFiveOddNumbers() {
        int[] oddNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            oddNumbers[i] = 2 * i + 1;
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        int[] oddNumbers = getFirstFiveOddNumbers();
        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
