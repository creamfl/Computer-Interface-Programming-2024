// Server.java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for a client...");

            while (true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream());

                // Receive array from client
                int[] arr = (int[]) objIn.readObject();

                // Sort the array
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }

                // Send sorted array back to client
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                for (int num : arr) {
                    out.writeInt(num);
                }

                // Close resources
                objIn.close();
                out.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
