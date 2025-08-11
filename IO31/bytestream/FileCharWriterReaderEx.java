package IO31.bytestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharWriterReaderEx {

	public static void main(String[] args) throws IOException {
		//write the file using file writer
		
		FileWriter fw= new FileWriter("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/");
		fw.write("I am the file writer");
		fw.close();
		
		//reading from file using file reader
		
		FileReader fr = new FileReader("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/");
		
		int i;
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
	}


}
