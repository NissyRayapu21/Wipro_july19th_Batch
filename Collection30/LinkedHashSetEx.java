package Collection30;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		//no duplicate,same order,only one null
		//not synchronized,slower performance(maintain)
		
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("L");
		lh.add("I");
		lh.add("N");
		lh.add("K");
		lh.add("E");
		lh.add("D");
		lh.add("H");
		lh.add("A");
		lh.add("S");
		lh.add("H");	
	    lh.add(null);
	    lh.add(null);
	    System.out.println(lh);
	    System.out.println(lh.size());
	}

}
