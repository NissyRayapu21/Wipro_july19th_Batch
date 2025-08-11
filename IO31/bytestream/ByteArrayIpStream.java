package IO31.bytestream;

import java.io.ByteArrayInputStream;

public class ByteArrayIpStream {

	public static void main(String[] args) {
		//read the array of input data(bytes)
		byte[] array= {1,2,3,4};
		try {
			ByteArrayInputStream input=new ByteArrayInputStream(array);
			for(int i=0;i<array.length;i++) {
				//read the bytes
				int data=input.read();
				System.out.print(data);
				}
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
