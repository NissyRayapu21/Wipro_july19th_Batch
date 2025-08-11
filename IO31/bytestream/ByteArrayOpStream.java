package IO31.bytestream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOpStream {
	public static void main(String[] args) {
		String data="This is nissy rayapu its is a string";
		try {
			    //create output stream
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte [] array=data.getBytes();
		       //write data to the output stream
			output.write(array);
			   //retrieve data from the output stream into string format
			String streamData = output.toString();	
			System.out.println("Output Stream: "+streamData);
		     
		      output.close();
	            }catch(Exception e) {
		            System.out.println(e);
	}
	}
}