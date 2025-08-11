package Collection30;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedUsingQueue {

	public static void main(String[] args) {
		Queue<String> lang=new LinkedList<>();
		
		lang.add("Java");
		lang.add("C");
		lang.add("C++");
		lang.add("Python");
		lang.add("HTML");
		System.out.println(lang);
		System.out.println(lang.peek());
		System.out.println(lang.poll());
		System.out.println(lang);
		System.out.println(lang.contains("C"));
	}

}
