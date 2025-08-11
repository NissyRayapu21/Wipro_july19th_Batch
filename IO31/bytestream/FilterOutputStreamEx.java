package IO31.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEx {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		FilterOutputStream filteroutput = null;
		
		try {
			//create file op stream to write to file
			
			fos = new FileOutputStream("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/");
			
			//wrap file input stream with buffered input stream
			
			filteroutput=new BufferedOutputStream(fos);
			
			//write the data to file
			
			String text =" hii this is nissy how are you";
			filteroutput.write(text.getBytes());
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			filteroutput.close();
			fos.close();
		}

	}

}
