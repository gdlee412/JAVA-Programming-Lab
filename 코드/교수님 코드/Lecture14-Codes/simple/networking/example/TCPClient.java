package simple.networking.example;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class TCPClient {
	public static void main(String argv[]) throws Exception {
		String sentence;
		String modifiedSentence;
		//read string from the keyboard
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		sentence = inFromUser.readLine();
		
		//Scanner inFromUser1 = new Scanner(System.in);
		//sentence = inFromUser1.nextLine();
		
		// open socket to the server
		Socket clientSocket = new Socket("localhost", 6789);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

		// send to the server
		outToServer.writeBytes(sentence + '\n');
		
		// receive from the server
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER: " + modifiedSentence);
		clientSocket.close();
	}
}