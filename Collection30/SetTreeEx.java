package Collection30;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeEx {

	public static void main(String[] args) {
	 //String	
     Set<String> st=new TreeSet<>();
     //no null,no duplicate
     st.add("Pineapple");
     st.add("Apple");
     st.add("Grapes");
     st.add("Orange");
     st.add("Null");
     System.out.println(st);
     System.out.println(st.contains("Apple"));
     System.out.println(st.isEmpty());
     System.out.println(st.size());
     System.out.println(st.remove("Banana"));
     System.out.println(st);
     
     //integer
     Set<Integer> si= new TreeSet<>();
     si.add(2);
     si.add(7);
     si.add(5);
     si.add(4);
     si.add(1);
    
     System.out.println(si);
     System.out.println(si.size());
     System.out.println(si.contains(8));
     System.out.println(si.add(6));
     System.out.println(si.remove(7));
     System.out.println(si);

	}

}
