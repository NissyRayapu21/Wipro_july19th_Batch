package Class31;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapTreeEx {
	

		public static void main(String[] args) {
		//map cannot contain dupli keys,values-dupli
			//no key dupli,multi null value,
			//no null key
			//not synchronized
			
			Map<Integer,String> hm= new TreeMap<Integer,String>();
			hm.put(6,"Apple");
			hm.put(5,"Banana");
			hm.put(3,"Cherry");
			hm.put(4,"Mango");
			hm.put(2,"Apple");
			hm.put(1,"Grapes");
			hm.put(7, null);
			hm.put(8, null);
	
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