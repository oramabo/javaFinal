package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient_listen  extends Thread{
	private Socket clientSocket;
	String modifiedSentence; 
	TCPClient_listen(Socket clientSocket ){
		this.clientSocket = clientSocket; 
	}
	  public String listen() {
	    	 BufferedReader inFromServer;
	    	 try {
				inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				 System.out.println(inFromServer.readLine());
					while(true)
					{
						modifiedSentence = inFromServer.readLine(); // getting from server
						if(modifiedSentence != null)
						{
							System.out.println("FROM : " + modifiedSentence);// printing in the console	
						}    
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ""; 
	    } 
}
