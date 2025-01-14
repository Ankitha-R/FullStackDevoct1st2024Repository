package gentechAcademy;

public class CubeCal {
    public static int calculateCube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        int result = calculateCube(3);
        System.out.println("The cube of 3 is: " + result);
    }
}
