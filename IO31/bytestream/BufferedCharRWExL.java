package IO31.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharRWExL {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/"));
		bw.write("I am buffered file writer");
		bw.close();
		
		//read the file
		
		BufferedReader br=new BufferedReader(new FileReader("C://Users//jakar//OneDrive//Documents//MCQjava//file.txt/"));
		
		String line;
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}


		

