import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the size of the array: ");
            int size = Integer.parseInt(reader.readLine());
            int[] arr = new int[size];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }

            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(arr);

            objOut.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
