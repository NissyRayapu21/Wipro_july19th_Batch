package package2;
import package1.Class1;

public class DiffPackNonSubCls {
	public void print() {
		System.out.println("Printing the data");
	}

	public static void main(String[] args) {
		Class1 obj= new Class1();
		obj.display();
		DiffPackNonSubCls obj1 = new DiffPackNonSubCls();
		obj1.print();// TODO Auto-generated method stub

	}

}
