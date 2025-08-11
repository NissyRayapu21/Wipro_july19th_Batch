package customer;

public class Custom1 {

protected static String custname="Rajesh";
         int custid=100;
         String custdept="Selling";
	
	//protected method
	protected void fetchcustname() {
		System.out.println("Customer name is"+ custname );
		
	}
	protected void fetchcustid() {
		System.out.println("Customer name is"+ custid);
	}
	protected void fetchcustdept() {
		System.out.println("Customer name is"+ custdept);
	}
		
		
	public static void main(String[] args) {
		Custom1 obj=new Custom1();
		obj.fetchcustname();
		obj.fetchcustid();
		obj.fetchcustdept();
		
		// TODO Auto-generated method stub

	}

}
