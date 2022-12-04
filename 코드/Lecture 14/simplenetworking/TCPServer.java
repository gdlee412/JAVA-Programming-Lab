package simplenetworking;

import java.io.*;
import java.net.*;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String clientSentence;
		String capitalizedSentence;
		System.out.println("Server Started...");
		ServerSocket welcomeSocket = new ServerSocket(6789);
		
		//kepp listening
		while(true)
		{
			//until client connects
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			clientSentence = inFromClient.readLine();
			
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			
			outToClient.writeBytes(capitalizedSentence);
			
			System.out.println("Server received/Sent...");
		}
	}

}
