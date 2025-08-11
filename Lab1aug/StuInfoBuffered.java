package Lab1aug;

import java.io.BufferedReader;
import java.io.FileReader;

public class StuInfoBuffered {

	public static void main(String[] args) {
		   String fileName = "C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/";

	        try {
	        	//line by line
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            String line;

	            System.out.println("Student List:");
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                String name = parts[0];
	                String age = parts[1];
	                System.out.println("Name: " + name + ", Age: " + age);
	            }

	            reader.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
		

	}

}
