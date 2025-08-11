package Class29;

public class ThrowExcep {
	
	public static void checkage(int age) throws Exception {
	
	if (age<18) {
		System.out.println("Create an Exception");
		//throw keyword
		throw new Exception("Age must be 18 or more to voter");
	}else {
		System.out.println("not eligible"); 
		
	}
	}

	public static void main(String[] args) throws Exception {
		ThrowExcep obj=new ThrowExcep();
		obj.checkage(10);
		
	}

}
