package Collection30;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedUsingDeque {

	public static void main(String[] args) {
		Deque<String> sub=new LinkedList<>();
		sub.add("Telugu");
		sub.add("Hindi");
		sub.add("English");
		sub.add("Maths");
		sub.add("Science");
		sub.add("Social");
		sub.addFirst("Subjects");
		sub.addLast("In School");
		System.out.println(sub);
		System.out.println(sub.peek());
		System.out.println(sub.getLast());
		System.out.println(sub.remove("English"));
		System.out.println(sub);
		System.out.println(sub.poll());
		System.out.println(sub);
				
	}

}
