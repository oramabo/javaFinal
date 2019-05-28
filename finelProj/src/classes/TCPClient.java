package classes;
import java.io.*; 
import java.net.*;
import java.util.HashMap;

class TCPClient { // Receive thread
	 public Socket clientSocket;
	 String modifiedSentence;
     TCPClient() 
    {   
        try {
			 clientSocket = new Socket("192.168.1.107", 10001);
			listen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //call the server
        
    }
     
     
     public String sendMsg(HashMap<String, String>data) {
        TCPClient_send s1 = new TCPClient_send(clientSocket);
        s1.send(data);
		return "";
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



