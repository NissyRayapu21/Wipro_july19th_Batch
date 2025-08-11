package company;

public class Company1 {

	public String Employeename="Chintu";
	
	void fetchempname() {
		System.out.println( "Employee name is " +Employeename );
		}
	public int Employeeid=61;
	
	void fetchempid() {
		System.out.println( "Employee id no " +Employeeid );
		}
	public String Employeedept="CEO";
	
	public void fetchempdept() {
		System.out.println( "Employee dept is " +Employeedept );
		}
	
	public void display() {
		System.out.println("Displaying the data of a company employee");
	}
	
	

	public static void main(String[] args) {
		Company1 obj = new Company1();
		obj.display();
		obj.fetchempname();
		obj.fetchempid();
		obj.fetchempdept();
		
	
		
		
		// TODO Auto-generated method stub

	}

}
