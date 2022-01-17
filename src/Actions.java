import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Actions {

    String userDirectory = System.getProperty("user.dir");
    String usersfolder = userDirectory + "\\" + "users";
    Scanner s = new Scanner(System.in);
    File directory = new File(usersfolder);

    public void createNewDirectory() {

        if (!directory.exists()) {
            directory.mkdir();
        }

    }

    public void listAllFilesAscOrder() {
        List files = Arrays.asList(directory.list());
        Collections.sort(files);
        for (Object f : files) {
            System.out.println(f);
        }
        System.out.println("*********************************");

    }

    public void addNewFile() {
        System.out.println("enter file name \n");
        String userInput = s.next();
        String fileName = usersfolder + "\\" + userInput.toLowerCase() + ".txt";

        File file = new File(fileName);
        boolean result;

        try {
            result = file.createNewFile();
            if (result) {
                System.out.println("File Created succussfully at this directory" + file.getCanonicalPath());
            } else {
                System.out.println("File already exists at " + file.getCanonicalPath());


            }
        } catch (IOException e) {
            System.out.println("Error during creating file..plesae try again");
        }


    }

    public void deleteFile() {
        System.out.println("enter file name \n");
        String userInput = s.next();
        String fileName = usersfolder + "\\" + userInput.toLowerCase() + ".txt";
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted Succussfully");
        } else {
            System.out.println("File doesn't exist");

        }


    }

    public void searchForFile() {

        System.out.println("enter file name \n");
        String userInput = s.next();
        String fullfilename = userInput +".txt";
        String[] filesList = directory.list();
        int foundflag = 0;
        if (filesList.length==0) {
            System.out.println("Empty directory. please start creating new files");

        } else {
            //search for the file linear search
            for (int i = 0; i < filesList.length; i++) {
                String filename = filesList[i];
                if (filename.equalsIgnoreCase(fullfilename)) {
                    System.out.println(filename + " found");
                    foundflag = 1;
                }
            }
            if (foundflag == 0) {
                System.out.println("file not found");
            }

        }

    }
}

