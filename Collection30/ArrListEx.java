package Collection30;

import java.util.ArrayList;

public class ArrListEx {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		
		//insertion(creation,accessing,updating,removing)
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Blue");
		a1.add("Apple");
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("Banana"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(2));
		System.out.println(a1);
		System.out.println(a1.set(0,"Dog"));
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.contains("Blue"));

}
}
