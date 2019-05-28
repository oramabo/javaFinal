package classes;

import java.awt.Menu;
import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

public class MainClient {
	TCPClient client = new TCPClient();
	
	
	public static HashMap<String, String>  login() {
		HashMap<String, String> dataMap;
	    Console console = System.console();
	    Scanner userNameScanner = new Scanner(System.in);
	    System.out.println(" Enter Username : " );
	    String userNameString = userNameScanner.nextLine();
	    System.out.println("Username : " + userNameString );
	    System.out.println(" Enter pwd : " );
	    String pwdString = userNameScanner.nextLine();
	    userNameScanner.close();
	    System.out.println("pwd : " + pwdString );
	    dataMap = new HashMap<String, String>();
		dataMap.put("func", "login");
		dataMap.put("username", userNameString);
		dataMap.put("password", pwdString);
		return dataMap;
	}
	
	public static void menu() {
		Scanner in = new Scanner(System.in);

            // print menu


            System.out.println( "1 ) Building Managment Press 1");
            System.out.println("2 ) Building Resdient Press 2");
            System.out.println("0. Quit");

            // handle user commands

            int userStatus;
            System.out.print("Choose Your User Status: ");

            userStatus = in.nextInt();

            switch (userStatus) {

			case 1:
				login();
            	System.out.println("You've chosen building managment status !#1");
                        // do something..
            	break;

            case 2:

                System.out.println("You've chosen item #2");

                // do something...

                break;


            default:

                System.out.println("Invalid choice.");

		}		


            System.out.println("Bye-bye!");

        }

	
	
	
	
	public static void main(String[] args) {
		// start the menu to check which user 
		menu();
		// login
		
	}
}
