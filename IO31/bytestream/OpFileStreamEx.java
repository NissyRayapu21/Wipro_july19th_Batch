package IO31.bytestream;

import java.io.FileOutputStream;

public class OpFileStreamEx {
	public static void main(String[] args) {
		
	
	String data="I am Attending the java class-output file ex";
	try {
		
		FileOutputStream output= new FileOutputStream("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/");
		
		byte[] array=data.getBytes();
		//write the byte array to the file
		output.write(array);;
		output.close();
	}
	catch (Exception e) {
		System.out.println(e);
	
	}
 
	}

}
