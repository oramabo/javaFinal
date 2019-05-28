import java.util.Scanner;

 

public class SwitchOperatedTextMenu {

    public SwitchOperatedTextMenu() {

        Scanner in = new Scanner(System.in);

        // print menu


        System.out.println( "1 ) Building Managment Press 1");
        System.out.println("2 ) Building Resdient Press 2");
        System.out.println("0. Quit");

            // handle user commands

        boolean quit = false;
        int userStatus;
        System.out.print("Choose Your User Status: ");
        userStatus = in.nextInt();

        switch (userStatus) {

            case 1:
                new Login();
                System.out.println("You've chosen building managment status !");
                        // do something...
                break;

            case 2:
            new Login();
            System.out.println("You've chosen Building Resident status !");
                        // do something...
            break;

            System.out.println("Bye-bye!");

    }

}