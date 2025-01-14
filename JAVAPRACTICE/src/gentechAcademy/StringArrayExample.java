package gentechAcademy;

public class StringArrayExample {
    public static String[] getStringArray() {
        return new String[]{"ankitha", "ram", "sushma", "kiran"};
    }

    public static void main(String[] args) {
        String[] result = getStringArray();
        for (String str : result) {
            System.out.println(str);
        }
    }
}

