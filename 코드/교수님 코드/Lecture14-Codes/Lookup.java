import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lookup {
	public static void main(String[] args) {

		for (String s : args) {
			String hostname = s;
			try {

				InetAddress a = InetAddress.getByName(hostname);

				System.out.println(hostname + ":" + a.getHostAddress());

			} catch (UnknownHostException e) {

				System.out.println("No address found for " + hostname);

			}
		}
	}
}
