package lab24;
abstract class Employee {
	{
	    String name;
	    int id;
	}

	    Employee(String name, int id) {
	       this.name=name;
	       this.id =id;
	    }

 abstract double calculateSalary();
	}

	// sub class
	class PermanentEmployee extends Employee {
	    double monthlySalary;

	    PermanentEmployee(String name, int id, double monthlySalary) {
	        super(name, id);
	        this.monthlySalary = monthlySalary;
	    }

	    double calculateSalary() {
	        return monthlySalary;
	    }
	}

	//sub2 class
	class ContractEmployee extends Employee {
	    double hourlyRate;
	    int hoursWorked;

	    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
	        super(name, id);
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	    }

	    double calculateSalary() {
	        return hourlyRate * hoursWorked;
	    }
	}
