package Class31;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//it overrides the default equalS()method to compare objs

public class EqualsMethod {
	int id;
	String name;
	 EqualsMethod(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 // Overriding equal () to compare the object content
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj) return true ; // same obj in memory or not
		 if(obj == null || getClass()!= obj.getClass()) return false;
          //compare bw two fields
		 Employee other  = (Employee)obj;
		 return this.id == other.id && this.name.equals(other.name);
	 }

	 @Override//compare data
	 public int hashCode() {
		 return Objects.hash(id ,name);
	 }
	 @Override
	 public String toString() {
			return id   + "_" + name;

		}


 
	public static void main(String[] args) {
 
 
		List<Employee>  emp = new ArrayList<>();
		emp.add(new Employee (103, "Ravi"));
		emp.add(new Employee (101, "Amit"));
		emp.add(new Employee (102, "Zara"));

		emp.add(new Employee (102, "Zara"));

		emp.add(new Employee (104, "John"));

		for (Employee e: emp ) {
			System.out.println(e);
		}
 
 
	}
}

	