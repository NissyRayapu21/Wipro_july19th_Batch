package labcoll30;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedTwo {

	public static void main(String[] args) {
		 LinkedList<Integer> list1 = new LinkedList<>();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 System.out.println(list1);
	      LinkedList<Integer> list2 = new LinkedList<>();
	      list2.add(1);
	      list2.add(2);
	      list2.add(4);
	      System.out.println(list2);
	      
	      System.out.println(list1.equals(list2));

	  /*  boolean isEqual = list1.equals(list2);

	        System.out.println("Are both same: " + isEqual);*/
	    }
	

	}


