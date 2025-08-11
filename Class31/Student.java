package Class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	     int rollno;
	     String name;
	     
	     //constructor of cls to pass parameters
	     
	     public Student(int rollno,String name) {
	    	 this.rollno=rollno;
	    	 this.name=name;
	     }
	    	 
	    	 //implement compareTo method for natural ordering(rollno)
	    	 
	    	 public int compareTo(Student s) {
	    		 return this.rollno -s.rollno;
	    	 }
	    	 
	    	 public String toString() {
	    		 return rollno +"-"+name;
	    	 
	     }
	     //sorting list of student

	public static void main(String[] args) {
		List<Student> stu= new ArrayList<>();
		stu.add(new Student (101,"Sandeep"));
		stu.add(new Student (104,"Santhosh"));
		stu.add(new Student (102,"Shiney"));
		stu.add(new Student (103,"Snehal"));
         
		Collections.sort(stu);
		for(Student s : stu) {
			System.out.println(s);
		}

	}

}
