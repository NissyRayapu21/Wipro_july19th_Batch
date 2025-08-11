package corejavaone;

public class MethodAndData {
	 public String empname = "John";
	 public int empid = 21;
	 public String empdept ="HR";
	 
	 public void fetchempdetails() {
	 
	    System.out.println(empname);
	    System.out.println(empid);
	    System.out.println(empdept);
	 }
	public static void main(String[] args) {
		
		 MethodAndData md = new MethodAndData();
		 md.fetchempdetails();
		// TODO Auto-generated method stub

	}

}
