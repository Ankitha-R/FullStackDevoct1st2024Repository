package gentechAcademy; 

public class ByteArrayExample {

    
        byte[] generateByteArray() {
        byte[] byteArray = {10, 20, 30, 40, 50};
        return byteArray; 
    }

    public static void main(String[] args) {
        
        ByteArrayExample example = new ByteArrayExample();
        byte[] result = example.generateByteArray();
        System.out.println("Returned Byte Array:");
        for (byte b : result) {
            System.out.print(b + " ");
        }
    }
}
