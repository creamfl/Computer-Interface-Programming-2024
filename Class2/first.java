import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class first {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the host address:");
            String host = reader.readLine();
            
            InetAddress inetAddress = InetAddress.getByName(host);
            
            System.out.println("Host Address: " + inetAddress.getHostAddress());
            
            System.out.println("Canonical Host Name: " + inetAddress.getCanonicalHostName());
            
            boolean isReachable = inetAddress.isReachable(5000);
            System.out.println("Is host reachable in 5 seconds? " + isReachable);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
