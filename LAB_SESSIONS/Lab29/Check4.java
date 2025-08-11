package Lab29;

public class Check4 {

	public static void main(String[] args) {
		try
        {
           System.out.println(1);
        }
        catch (Exception e) 
        {
            System.out.println(2);
        }
       //System.out.println(3);//anything is not allowed bw try/catch and finally
        finally
        {
            System.out.println(4);
        }
		
		
		//check5
	     System.out.println(1);
	        try
	        {
	            System.out.println(2);
                                                //st="123"	
	                                          //int n=Integer.parseInt(st)
	            int i = Integer.parseInt("ABC");//string into int
	            System.out.println(3);           
	        }
	        catch (Exception e) {
	
	            System.out.println(e);
	        }
	        finally
	        {
	            System.out.println(5);
	        }
	        System.out.println(6);
	    }
	
	}
	

		