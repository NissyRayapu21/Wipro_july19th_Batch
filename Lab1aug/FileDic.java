package Lab1aug;

import java.io.File;

public class FileDic {

	public static void main(String[] args) {
		
	     // Specify the path of the directory
        String path = "C:/Users/jakar/OneDrive/Documents/MCQjava";
        

        // Create a File object
        File folder = new File(path);

        // Get list of all files and directories
        String[] list = folder.list();

        // Check if the directory exists and is not 
        if (list != null) {
            System.out.println("Files and directories in the folder:");
            for (String name : list) {
                System.out.println(name);
            }
        } else {
            System.out.println("The directory does not exist or is empty.");
        }
    }
}

