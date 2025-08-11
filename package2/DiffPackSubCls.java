package package2;
import package1.Class1;
import customer.Custom1;

public class DiffPackSubCls extends Class1{
	public void create() {
		System.out.println("Creating in sub class");
		
	}

	public static void main(String[] args) {
		 DiffPackSubCls obj = new  DiffPackSubCls();
		 
		 obj.create();
		 obj.display();
		 obj.fetchemployeedept();
		
		 // TODO Auto-generated method stub

	}

}
