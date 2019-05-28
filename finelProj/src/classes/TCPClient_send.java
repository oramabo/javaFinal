package classes;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TCPClient_send extends Thread {// the client sending thread - send to server
	
	private Socket clientSocket;
	private Map<String, String> dataMap;
	
	TCPClient_send(Socket clientSocket, HashMap<String, String> dataMap)
	{
		this.clientSocket = clientSocket ; 
		this.dataMap = dataMap;
	}
	
	public void run()
	{
        String sentence; 
        String modifiedSentence; 
        
			try {
				OutputStream oStream = clientSocket.getOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(oStream);
				objectOutputStream.writeObject(dataMap);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			
                
		
    
       // clientSocket.close(); // close the client socket
                  
    } 
} 



