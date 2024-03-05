import java.net.*;
import java.io.*;

public class Server {
    private ServerSocket server = null;
    private Socket socket = null;
    private DataInputStream in = null;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");

            socket = server.accept();
            System.out.println("Client connected");

            in = new DataInputStream(socket.getInputStream());

            String receivedData = in.readUTF();
            String response = receivedData.toUpperCase();
            System.out.println("Received from client: " + receivedData);
            System.out.println("Sending back: " + response);
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
