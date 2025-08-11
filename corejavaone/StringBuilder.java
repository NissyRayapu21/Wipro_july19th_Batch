package corejavaone;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rayapu");
		System.out.println(sb);
		//
		sb.append("Nissy");
		System.out.println(sb);
		
	      	//reverse
		     System.out.println(sb.reverse());
		     System.out.println(sb.reverse());
		
		      //isEmpty
				System.out.println(sb.isEmpty());
				
				//insert
				System.out.println(sb.insert(4, "x"));
				
			
				//substring
				System.out.println(sb.substring(2, 4));
				
				//char
				System.out.println(sb.charAt(5));
				
				//length
				System.out.println(sb.length());
				
				//delete
				System.out.println(sb.delete(0,1));
				
				//replace
				System.out.println(sb.replace(0, 3,"xyz"));
				
				
				

	}

}
