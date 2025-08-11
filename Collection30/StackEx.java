package Collection30;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	 Stack<String> g= new Stack<>();
	 
	g.add("A");
	g.add("B");
	g.add("C");
	g.addElement("D");
	g.add(2, null);
	g.insertElementAt("X", 1);
	g.add("E");
	
	System.out.println(g);
	System.out.println(g.contains("B"));
	System.out.println(g.elementAt(0));
	System.out.println(g.lastElement());
	System.out.println(g.peek());
	System.out.println(g.empty());
	System.out.println(g.push("S"));
	System.out.println(g);
	System.out.println(g.pop());
	System.out.println(g);
	System.out.println(g.search("A"));
	System.out.println(g.firstElement());
	System.out.println(g.size());
	System.out.println(g.remove("C"));
	System.out.println(g);

	 

	}

}
