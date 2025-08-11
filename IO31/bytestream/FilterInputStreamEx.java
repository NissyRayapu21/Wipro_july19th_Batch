package IO31.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEx {

	public static void main(String[] args) {
	// filter stream filter data as they read and write data in the input stream
		//filters it and pass to on the underlying streams
		
		FileInputStream fis=null;
		FilterInputStream filterinput=null;
		try {
			//create file input stream for the file
			fis=new FileInputStream("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/");
			//wrap file into Str with buffered input str
			
			filterinput= new BufferedInputStream(fis);
			
			//read and print the file content
			
			int data;
			while((data= filterinput.read()) != -1) {
				
				System.out.print((char)data);
				
			}
			fis.close();
		}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
	}


