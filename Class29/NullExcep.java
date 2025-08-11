package Class29;

public class NullExcep {

	public static void main(String[] args) {
		try
		{
			String s1=null;
			System.out.println(s1.length());
		}
       catch(Exception e) {
    	   System.out.println(e);
       }
		
		try {
			int arr[] = {10,20,30};
			System.out.println(arr[4]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
