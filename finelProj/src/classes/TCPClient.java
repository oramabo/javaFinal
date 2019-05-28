package classes;
import java.io.*; 
import java.net.*;
import java.util.HashMap;

class TCPClient { // Receive thread
	 public Socket clientSocket;
	 public TCPClient_listen listner;
     TCPClient() 
    {   
        try {
			clientSocket = new Socket("192.168.1.107", 10001);
			listner = new TCPClient_listen(clientSocket);
			listner.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //call the server
        
    }
     
     
     public String sendMsg(HashMap<String, String>data) {
        TCPClient_send s1 = new TCPClient_send(clientSocket);
        s1.setData(data);
        s1.start();
        
		return "";
     }
   
} 



