package Class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashEx {

	public static void main(String[] args) {
		//no duplicate key,values-duplicate,one null key
		
		Map<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(6,"Apple");
		hm.put(5,"Banana");
		hm.put(3,"Cherry");
		hm.put(4,"Mango");
		hm.put(2,"Apple");
		hm.put(1,"Grapes");
		hm.put(null, "S");
		hm.put(null, null);
		
		System.out.println(hm);
		
		//converting map to set
		Set st= hm.entrySet();
		Iterator  it=st.iterator();
		while(it.hasNext()) {
			Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		

	}

}
