import java.util.Scanner;

public class Menus {


    public static void displayInfo() {
        System.out.println("****************************************\n" +
                "Application Name : test \n" +
                "Developer name   : abdelhamid elnaggar\n" +
                "****************************************\n");
    }


    public static void diplayPrimaryMenu() {
        System.out.println("please select one of these options\n" +
                "1-list all file\n" +
                "2-files menu\n" +
                "3-exit application\n");

    }
    public static void  handleUserinput(){
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        switch (userInput){
            case 1 :
                break;
            case 2 :
                displaySubmenu();
                break;
            case 3 :
                System.exit(0);
        }
    }
    public static void displaySubmenu()
    {
        System.out.print("\033[H\033[2J");

        System.out.println("please select one of these options\n" +
                "1-list all file\n" +
                "2-files menu\n" +
                "3-exit application\n");
    }
}
