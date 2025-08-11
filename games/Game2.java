package games;

public class Game2 extends Game1 {
	void display() {
		System.out.println("Gamer list");
	}
	

	public static void main(String[] args) {
		Game2 obj=new Game2();
		obj.display();
		obj.fetchgname();
		
		// TODO Auto-generated method stub

	}

}
