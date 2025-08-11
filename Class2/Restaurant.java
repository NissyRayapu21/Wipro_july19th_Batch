package Class2;

public class Restaurant {

	public static void main(String[] args) {
		
		CookingTask c1 = new CookingTask("Pasta");
		CookingTask c2 = new CookingTask("Dosa");
		CookingTask c3 = new CookingTask("Salad");
		CookingTask c4 = new CookingTask("Rice");
		CookingTask c5 = new CookingTask("Upma");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();

	}

}
