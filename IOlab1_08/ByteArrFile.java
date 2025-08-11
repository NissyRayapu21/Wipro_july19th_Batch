package IOlab1_08;

import java.io.File;
import java.io.FileInputStream;

public class ByteArrFile {

	public static void main(String[] args) {
	    // Specify the file path
        String filePath = "C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/"; 
        File f = new File(filePath);

        try {
            // Create FileInputStream
            FileInputStream fis = new FileInputStream(f);

            // Create byte array of file length
            byte[] byteArray = new byte[(int) f.length()];

            // Read file into byte array
            fis.read(byteArray);

            
            fis.close();

            // Print byte array content 
            System.out.println("File content :");
            for (byte b : byteArray) {
                System.out.print((char) b); // char for display
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


