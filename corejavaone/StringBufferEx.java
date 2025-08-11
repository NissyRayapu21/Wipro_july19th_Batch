package corejavaone;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		//append
		sb.append("World");
	
		//reverse
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		//isEmpty
		System.out.println(sb.isEmpty());
		
		//insert
		System.out.println(sb.insert(4, "z"));
		
		//substring
		System.out.println(sb.substring(2, 4));
		
		//char
		System.out.println(sb.charAt(5));
		
		//length
		System.out.println(sb.length());
		
		//delete
		System.out.println(sb.delete(0,1));
		
	}

}
