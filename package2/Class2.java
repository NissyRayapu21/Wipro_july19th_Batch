package package2;
import package1.Class1;



public class Class2 {
	public void print() {
		System.out.println("Printing the Data");
	}

	public static void main(String[] args) {
		Class1 obj= new Class1();
		obj.display();
		Class2 obj1=new Class2();
		obj1.print();
		Class2 obj3=new Class2();
		obj3.print();
		

	}

}
