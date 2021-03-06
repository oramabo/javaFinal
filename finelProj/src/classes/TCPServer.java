package classes;
import java.io.*; 
import java.net.*; 
import java.util.ArrayList;
import java.util.Map;

class TCPServer { 

	
	 static void sendMsg(Socket incoming , String  msg) {
		String clientSentence; 
		System.out.println("send msg to:" + incoming);
		try
		{
	       DataOutputStream  outToClient = 
	         new DataOutputStream(incoming.getOutputStream());
			clientSentence=msg;
			clientSentence += '\n'; //MUST BE \N !!!!!!!!!!!!
			outToClient.writeBytes(clientSentence );// sending to the client clientSentence string	   
	     
       
		}
		catch(IOException e)
		{
			
		}
	}
	
	static void reciveMsg(Socket incoming ) {
		String clientSentence;
		try
		{
			InputStream is = incoming.getInputStream();   
			while(true) {
			   ObjectInputStream data= new ObjectInputStream(is);
			   Map<String, String> dataMap = (Map) data.readObject();
			   
			   String func = dataMap.get("func");
			   switch (func) {
					case "login":
						String username = dataMap.get("username");
						String password = dataMap.get("password");
						System.out.println(username);
						System.out.println(password);
						sendMsg(incoming, "https://prod.liveshare.vsengsaas.visualstudio.com/join?595C67C7C64C74E4406EBA1ADE155E12CBC5");	
						break;
		
					default:
						sendMsg(incoming, "Function not found....");	
						break;
				}

			}
			
		}
		catch(IOException e)
		{
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}

	}
	
	
	
  public static void main(String argv[]) throws Exception 
    { 
	 
	  ServerSocket s = null;
	 
		try {
		    s = new ServerSocket(10001);
		
		} catch(IOException e) {
		    System.out.println(e);
		    System.exit(1);
		}

		while (true) {
		    Socket incoming = null;
		    
		    try {
		    	incoming = s.accept();
			
		    } catch(IOException e) {
		    	System.out.println(e);
			continue;
		    }
		    System.out.println(incoming);
		    reciveMsg(incoming);    		    
		    
		}
    } 
} 
