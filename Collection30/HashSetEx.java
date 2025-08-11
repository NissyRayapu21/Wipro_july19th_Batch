package Collection30;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		//no dupli,mutliple null(one gives,no order)
		hs.add("H");
		hs.add("A");
		hs.add("S");
		hs.add("H");
		hs.add("S");
		hs.add("E");
		hs.add("T");
	    hs.add(null);
	    System.out.println(hs);
	    System.out.println(hs.isEmpty());
	    System.out.println(hs.size());
	    System.out.println(hs.remove("S"));
	    System.out.println(hs);
	    System.out.println(hs.add("X"));
	   System.out.println(hs);
	     //check
	   if(hs.contains("A"))
	   {
		   System.out.println("yes its there");
	   }else {
		   System.out.println("not there");
	   }

	}

}
