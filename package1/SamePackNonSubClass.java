package package1;
import games.Game1;


public class SamePackNonSubClass extends Class1 {
	public void write() {
		System.out.println("Writing in sub class");
		
	}
	
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.display();//inherited
		 SamePackNonSubClass obj1=new  SamePackNonSubClass ();
		 obj1.write();//own
		 obj.fetchemployeeid();
		 obj.fetchemployeedept();
		 
		 
		
		
		// TODO Auto-generated method stub

	}

}
