package corejavaone;

public class GC {
	public void finalize() {
		System.out.println("obj is garbage collected");
		
	}

	public static void main(String[] args) {
		GC obj = new GC();
		//by  nulling the reference
		obj = null;
		//
		GC obj1 = new GC();
		
		GC obj2 = new GC();
		
		obj1 = obj2;
		//obj is out of scope
		GC obj3 = new GC();
		System.gc();
		Runtime.getRuntime().gc();
		
		
		

	}

}
