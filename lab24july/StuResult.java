package lab24july;

public class StuResult {

		
		    public static void main(String[] args) {
		        Student s1 = new EngStu("Rahul", 1);
		        Student s2 = new MedStu("Neha", 2);

		        System.out.println(s1.name + " Grade: " + s1.getGrade(78));
		        System.out.println(s2.name + " Grade: " + s2.getGrade(32));
		    }
		
		

	

}
