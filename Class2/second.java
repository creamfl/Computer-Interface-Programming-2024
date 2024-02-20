import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class second {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the domain name:");
            String domainName = reader.readLine();
            
            InetAddress[] inetAddresses = InetAddress.getAllByName(domainName);
            
            System.out.println("IP addresses associated with " + domainName + ":");
            for (InetAddress inetAddress : inetAddresses) {
                System.out.println(inetAddress.getHostAddress());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
