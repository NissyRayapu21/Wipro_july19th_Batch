package labcoll30;

import java.util.ArrayList;

public class ColorArrList {

	public static void main(String[] args) {
		ArrayList<String> c=new ArrayList<String>();
		
		c.add("Red");
		c.add("Pink");
		c.add(2, null);
		c.add("Blue");
		c.add("Yellow");
		c.add("Green");
		c.add(6,"Orange");
		System.out.println(c);
		System.out.println(c.contains("Red"));
		System.out.println(c.get(4));
		System.out.println(c.isEmpty());
		System.out.println(c.remove("Yellow"));
		System.out.println(c);
		System.out.println(c.add("Brown"));
		System.out.println(c);

		}

}


