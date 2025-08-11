package IO31.bytestream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) {
	// it converts objects into byte streams
	
		try {
			//creating the object of cls file
			StudentSer s1= new StudentSer(101,"Peter");
			
			//creating the object stream to store obj, writing the object
			FileOutputStream fout= new FileOutputStream("C://Users//jakar//OneDrive//Documents//MCQjava//serial.txt/");
			
			//creating ObjOpStream to convert obj-byte stream
			ObjectOutputStream Objout=new ObjectOutputStream(fout);
			
			//serialize the object(write it to file)
			Objout.writeObject(s1);
			Objout.flush();
			
			//closing streams
			fout.close();
			Objout.close();
			
			System.out.println("Object is Serialiazed");;
		} catch(Exception e) {
		     System.out.println(e);
		}
	}

}
