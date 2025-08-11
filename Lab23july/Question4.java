package Lab23july;
class Employee{
public void work() {
	System.out.println("I am working");
}
public void salary() {
	System.out.println("The salary is confidential");
}
}

class HR extends Employee{
@Override
public void work() {
	System.out.println("I am  HR i dont do any work");
}
public void addEmployee(){
	System.out.println("I recruited one employee");
}
}
public class Question4 {

public static void main(String[] args) {
	HR h = new HR();
	h.work();
	h.addEmployee();

}

}
