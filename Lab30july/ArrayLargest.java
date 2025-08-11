package Lab30july;

import java.util.ArrayList;

public class ArrayLargest {

	public static void main(String[] args) {
		
	 ArrayList<Integer> l = new ArrayList<>();
		        l.add(1);
		        l.add(4);
		        l.add(3);
		        l.add(2);
		        l.add(5);
		        l.sort(null);
		        System.out.println(l);
		       
		        System.out.println("Second Largest numbers: "+l.get(3));

		        
		        }
		    }

/*int max = Integer.MIN_VALUE;
		        int sec = Integer.MIN_VALUE;

		        for (int num : l) {
		            if (num > max) {
		                sec = max;
		                max = num;
		            } else if (num > sec && num != max) {
		                sec = num;
		            }
		        }

		        if (sec != Integer.MIN_VALUE) {
		            System.out.println("Second largest: " + sec);
		        } else {
		            System.out.println("Not there"); */


		

