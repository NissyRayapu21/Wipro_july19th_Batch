package package1;

public class Class1 {
	//protected variable
	protected static String EmployDep="HR Dept";
	
	//protected method
	protected void fetchemployeedept() {
		System.out.println("Employee is belong to " +  EmployDep);
	}
	//private variable
	private static String EmployeeSalary="2500";
	//private method
	private void fetchsalary() {
		System.out.println("the employee salary is:"+EmployeeSalary);
	}
	//public method
	public void display() {
		System.out.println("Displaying the data in parent data");
	}
	
	//default variable
	
	int employeeid=21;
	//default method
	
	void fetchemployeeid() {
		System.out.println("Employee id is:"+employeeid);
	}
	public static void main(String[] args) {
		Class1 obj= new Class1();
		obj.display();
		obj.fetchsalary();
		obj.fetchemployeeid();
		obj.fetchemployeedept();
		

	}

}
