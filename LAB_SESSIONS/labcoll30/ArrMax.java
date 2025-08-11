package labcoll30;

import java.util.ArrayList;

public class ArrMax {

	public static void main(String[] args) {
	      ArrayList<Integer> lt = new ArrayList<>();
	        lt.add(70);
	        lt.add(40);
	        lt.add(90);
	        lt.add(10);
	        lt.sort(null);
	        System.out.println(lt);
	        System.out.println();

	      /*  int max = lt.get(0);
	        for (int i = 1; i < lt.size(); i++) {
	            if (lt.get(i) > max) {
	                max = lt.get(i);
	            }
	        } */

	        System.out.println("Maximum element is: " + lt.get(3));
	    }
	}

	


