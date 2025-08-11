package Collection30;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> b1=new LinkedList<String>();
		b1.add("A");
		b1.add("B");
		b1.add("C");
		b1.add("D");
		b1.add("E");
		b1.add("A");
		b1.add(null);
		b1.addFirst("J");
		b1.addLast("O");
		System.out.println(b1);
		System.out.println(b1.get(3));
		System.out.println(b1.contains("A"));
		System.out.println(b1.isEmpty());
		System.out.println(b1.remove(2));
		System.out.println(b1);
		System.out.println(b1.set(1,"Z"));
		System.out.println(b1);
		System.out.println(b1.add("X"));
		System.out.println(b1);
		
		
		
				


	}

}
