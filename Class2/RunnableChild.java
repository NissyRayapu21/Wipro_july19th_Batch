package Class2;

public class RunnableChild  {

	public static void main(String[] args) {
	
		int n=10;
		for(int i=1; i<n; i++) {
			
			Thread obj= new Thread(new RunnableChild());
		    
			obj.start();	
		}

	}

}
