package Class2;

public class ThreadSynchro {
	
	private int c = 0; //shared variable
	//syncho method to increment counter
	
	public synchronized void inc() {
		c++;
	}
	//sync method to get the counter value
	public synchronized int get() {
		return c;

	
	}

}
