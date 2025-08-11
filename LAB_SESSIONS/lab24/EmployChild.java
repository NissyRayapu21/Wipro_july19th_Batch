package lab24;

public class EmployChild {
	
	    public static void main(String[] args) {
	        PermanentEmployee pe = new PermanentEmployee("Alice", 101, 50000);
	        ContractEmployee ce = new ContractEmployee("Bob", 102, 300, 160);

	        System.out.println("Permanent Employee Salary: " + pe.calculateSalary());
	        System.out.println("Contract Employee Salary: " + ce.calculateSalary());
	    }
	

	
	}


