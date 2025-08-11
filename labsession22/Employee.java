package labsession22;

 class Employee1 {
	
	    void work() {
	        System.out.println("Employee is working");
	    }

	    double getSalary() {
	        return 25000;
	    }
	}

	class HRManager extends Employee1 {
	    @Override
	    void work() {
	        System.out.println("HR Manager is hiring");
	    }

	    void addEmployee() {
	        System.out.println("Employee added");
	    }
	}

public class Employee{
	    public static void main(String[] args) {
	        HRManager hr = new HRManager();
	        hr.work();
	        hr.addEmployee();
	        System.out.println("Salary: " + hr.getSalary());
	    }
	


	}


