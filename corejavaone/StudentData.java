package corejavaone;

public class StudentData {
	
	public int stroolno = 2;
	String stname = "Nissy";
	String stdept = "ECE";
	int stsec = 1;
	
    public void fetchstdetails(){
    	System.out.println(stroolno);
    	System.out.println(stname);
    	System.out.println(stdept);
    	System.out.println(stsec);
		
	}
	

	public static void main(String[] args) {
		
		StudentData st = new StudentData();
		st.fetchstdetails();
		// TODO Auto-generated method stub

	}

}
