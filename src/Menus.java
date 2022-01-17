import java.util.Scanner;

public class Menus {

    Actions actions = new Actions();

    public void displayInfo() {
        System.out.println("****************************************\n" +
                "Application Name : test \n" +
                "Developer name   : abdelhamid elnaggar\n" +
                "****************************************\n");

    }


    public void diplayPrimaryMenu() {
        System.out.println("please select one of these options\n" +
                "1-list all file\n" +
                "2-files menu\n" +
                "3-exit application\n");

        handleUserInputPrimaryMenu();
    }

    public void handleUserInputPrimaryMenu() {
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        switch (userInput) {
            case 1:
                actions.createNewDirectory();
                actions.listAllFilesAscOrder();
                diplayPrimaryMenu();
                break;
            case 2:
                displaySubmenu();
                handleUserInputSubmenuMenu();
                diplayPrimaryMenu();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void displaySubmenu() {

        System.out.println("please select one of these options\n" +
                "1-add new file\n" +
                "2-delete file\n" +
                "3-search for a file\n" +
                "4-return to main menu\n" +
                "5-exit application\n");
    }

    public void handleUserInputSubmenuMenu() {
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        switch (userInput) {
            case 1:
                //add new file
                actions.addNewFile();
                break;
            case 2:
                //delete file
                actions.deleteFile();
                break;
            case 3:
                //search for afile
                actions.searchForFile();
                break;
            case 4:
                //return to main menu
                diplayPrimaryMenu();
                break;
            case 5:
                System.exit(0);
        }
    }
}
