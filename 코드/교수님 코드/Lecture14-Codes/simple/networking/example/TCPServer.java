package simple.networking.example;

import java.io.*;
import java.net.*;

class TCPServer {

	public static void main(String argv[]) throws Exception {
		String clientSentence;
		String capitalizedSentence;
		System.out.println("Server Started...");
		ServerSocket welcomeSocket = new ServerSocket(6789);
		while (true) {
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(
					connectionSocket.getOutputStream());

			clientSentence = inFromClient.readLine();

			capitalizedSentence = clientSentence.toUpperCase() + '\n';

			outToClient.writeBytes(capitalizedSentence);
			System.out.println("Server received/Sent...");
		}

	}
}
