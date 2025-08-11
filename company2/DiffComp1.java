package company2;
import company.Company1;

public class DiffComp1 extends Company1 {
	public void print() {
		System.out.println("Employee data");
	}


	public static void main(String[] args) {
		DiffComp1 obj1 =new DiffComp1();
		obj1.print();
		
		
		Company1 obj= new Company1();
		 obj.display();
		 obj.fetchempdept();
		
	
		// TODO Auto-generated method stub

	}

}
