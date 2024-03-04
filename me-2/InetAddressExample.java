import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get the local host's InetAddress
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);

            // Resolve IP address by hostname
            InetAddress googleAddress = InetAddress.getByName("www.google.com");
            System.out.println("Google IP Address: " + googleAddress.getHostAddress());

            // Resolve hostname by IP address
            InetAddress ipAddress = InetAddress.getByName("8.8.8.8");
            System.out.println("Host Name for 8.8.8.8: " + ipAddress.getHostName());

            // Check if a host is reachable
            System.out.println("Google is reachable: " + googleAddress.isReachable(3000)); // Timeout in milliseconds

            // Get the canonical hostname (fully qualified domain name)
            System.out.println("Canonical Host Name for Google: " + googleAddress.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
