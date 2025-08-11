package Class2;

import java.util.ArrayList;

public class AutoBoxingWrapEx {

	public static void main(String[] args) {
		
		
		int a=100;
		
		//Integer i=Integer.ValueOf(a);
		Integer i=a;
		System.out.println(i);
		
		//arraylist
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("List is : "+list);
		
		//unboxing
		
		Integer b= new Integer(3);
		int x = b.intValue();
		int j=b;
		System.out.println(i);
		System.out.println(j);
				
				
		

	}

}
