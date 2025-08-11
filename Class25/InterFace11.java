package Class25;

public interface InterFace11 {
	
	//abstract method
	
	abstract void display();
	
	void read();
	//default method
	default void show() {
		System.out.println("Showing Data");
	}
	
	//static method
	
	static void write() {
		System.out.println("writing Data");
	}
	
	public static final String employname=("Smile");
	int employid=234;

}
