package IO31.bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializatinEx {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//create the stream and read the object
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C://Users//jakar//OneDrive//Documents//MCQjava//serial.txt/"));
		
		StudentSer s =(StudentSer)in.readObject();
		
		//printing the object details
		System.out.println(s.id+"-"+s.name);
		
		in.close();

	}

}
