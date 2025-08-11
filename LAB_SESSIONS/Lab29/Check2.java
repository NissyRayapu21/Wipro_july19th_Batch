package Lab29;

public class Check2 {
		
		    public static void main(String[] args) 
		    {
		        int i = 1;
		        try
		        {
		            i++;  //2
		        }
		        catch (Exception e) 
		        {
		            i++;  //skipped no exception occurs
		        }
		        finally
		        {
		            i++; //3
		        }
		        System.out.println(i);
		    }
		    
		    
}
		   
		
	


