package Class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    
    //constructor of cls to pass parameters
    
    public Employee(int id,String name) {
   	 this.id=id;
   	 this.name=name;
    }
   	 
   	 //implement compareTo method for natural ordering(rollno)
   	 
   	 public int compareTo(Employee em) {
   		 return this.name.compareTo(em.name);

   	 }
   	 
   	 public String toString() {
   		 return id +"-"+name;
   	 
    }
    //sorting list of student

public static void main(String[] args) {
	List<Employee> emp= new ArrayList<>();
	emp.add(new Employee (101,"Banana"));
	emp.add(new Employee (104,"Santhosh"));
	emp.add(new Employee (102,"Apple"));
	emp.add(new Employee (103,"Cherry"));
    
	Collections.sort(emp);
	for(Employee e : emp) {
		System.out.println(e);
	}

}
}
