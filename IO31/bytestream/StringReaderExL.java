package IO31.bytestream;

import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderExL {

	public static void main(String[] args) {
	
		String input = "This is String Reader,Writer";

        try {
            
            // Create StringWriter to write output
            StringWriter stringWriter = new StringWriter();
           // Create StringReader to read from string
            StringReader stringReader = new StringReader(input);

            int ch;
            // Read characters one by one and write them
            while ((ch = stringReader.read()) != -1) {
                stringWriter.write(ch);
            }

            // Get the final string from writer
            String output = stringWriter.toString();

            System.out.println( output);

            // Close resources
            stringReader.close();
            stringWriter.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


