package Collection30;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector<String> obj=new Vector<>();
		
		obj.add("sun");
		obj.add("Moon");
		obj.add("Earth");
		obj.add("West");
		obj.add("East");
		obj.add("South");
		obj.add(4,"North");
		obj.insertElementAt(null, 6);
		System.out.println(obj);
		System.out.println(obj.firstElement());
		System.out.println(obj.elementAt(3));
		System.out.println(obj.get(0));
		System.out.println(obj.lastElement());
		System.out.println(obj.remove("East"));
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.hashCode());
		
		
		
		
	}

}
