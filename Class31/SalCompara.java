package Class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalCompara implements Comparator<Product>{
	


	public int compare(Product p1, Product p2) {
		
	
		return (p2.price-p1.price);
	}

	public static void main(String[] args) {
	       List<Product> pd = new ArrayList<>();

	        pd.add(new Product("a", 1000));
	        pd.add(new Product("b", 2000));
	        pd.add(new Product("c", 150));
	        pd.add(new Product("c", 2550));
	        pd.add(new Product("d", 5000));

	        // Sort by name
	        Collections.sort(pd, new SalCompara ());  {
	            

	        // Display sorted products
	        for (Product p : pd) {
	            System.out.println(p);
	        }
	    }
	    }
	}
	

	


