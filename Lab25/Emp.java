package Lab25;

public class Emp {
	  private String name;
	  private int id;
	  private double salary;

	    // Setters 
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setSalary(double sal) {
	        if (sal > 0) {
	            this.salary = sal;
	        } else {
	            System.out.println("Invalid salary for employee ID " + id );
	        }
	    }

	   
	    // Display method
	    public void display() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);

	    }
	


public static void main(String[] args) {
    Emp e1 = new Emp();
    e1.setId(1);
    e1.setName("Nissy");
    e1.setSalary(2500);

    Emp e2 = new Emp();
    e2.setId(2);
    e2.setName("John");
    e2.setSalary(-5000);  

    Emp e3 = new Emp();
    e3.setId(3);
    e3.setName("Chintu");
    e3.setSalary(4000);


    e1.display();
    e2.display();
    e3.display();
}
}