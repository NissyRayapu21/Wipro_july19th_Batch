package collage;

public class Student {
	
	private static String stuname=("Chintu");
	private void fetchstuname() {
	System.out.println( "Student name is " +stuname);
	}
	private static int stuid=241;
	private void fetchstuid() {
		System.out.println("Student id :"+stuid);
		
	}
	
	private String studept="ECE Dept";
	void fetchstudept() {
		System.out.println("Student dept is "+studept);
	}

	public static void main(String[] args) {
		 Student obj = new  Student();
		 obj.fetchstuname();
		 obj.fetchstuid();
		 obj.fetchstudept();
		
		// TODO Auto-generated method stub

	}

}
