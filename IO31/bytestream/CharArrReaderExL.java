package IO31.bytestream;


import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrReaderExL {

	public static void main(String[] args) {
	       String text = "this is CharArrayReader,Writer";

	        try {
	            // Writing character
	            CharArrayWriter charWriter = new CharArrayWriter();
	            charWriter.write(text);

	            // Get  character array from writer
	            char[] charArray = charWriter.toCharArray();

	            // Now read from this char array using CharArrayReader
	            CharArrayReader charReader = new CharArrayReader(charArray);
	            int c;
	          
	            while ((c = charReader.read()) != -1) {
	                System.out.print((char) c);
	            }

	           
	            charWriter.close();
	            charReader.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

		
	


