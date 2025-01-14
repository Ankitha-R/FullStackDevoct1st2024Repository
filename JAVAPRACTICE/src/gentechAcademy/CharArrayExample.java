package gentechAcademy;

public class CharArrayExample {
    public static char[] getCharArray() {
        return new char[] {'A', 'B', 'C', 'D', 'E'};
    }

    public static void main(String[] args) {
        char[] result = getCharArray();
        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}
