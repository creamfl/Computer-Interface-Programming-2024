import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class fifth {
    public static void main(String[] args) {
        
        String fileName = "binaryData.bin";

        byte[] bytesOut = {1, 2, 3, 4, 5};

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(bytesOut);
            fos.close();

            FileInputStream fis = new FileInputStream(fileName);
            byte[] bytesIn = new byte[bytesOut.length];
            int bytesRead = fis.read(bytesIn);
            fis.close();

            System.out.println("Read " + bytesRead + " bytes:");
            for (byte b : bytesIn) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
