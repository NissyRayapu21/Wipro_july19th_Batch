package Class31;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSubCls implements Comparator<Product>{
	public int compare(Product p1, Product p2) {
		//return p1.name.compareTo(p2.name);//sort by name
	
		return (p1.price-p2.price);//sort by price
	}
	
  
	
	

	    public static void main(String[] args) {
	        List<Product> pd = new ArrayList<>();

	        pd.add(new Product("Rice", 140));
	        pd.add(new Product("Oil", 10));
	        pd.add(new Product("Dal", 150));
	        pd.add(new Product("Soap", 50));
	        pd.add(new Product("AC", 5000));

	        // Sort by name
	        Collections.sort(pd, new ProductSubCls());  {
	            

	        // Display sorted products
	        for (Product p : pd) {
	            System.out.println(p);
	        }
	    }
	    }
}
	

