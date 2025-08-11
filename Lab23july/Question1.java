package Lab23july;
class Animal{
	 void makesound() {
		System.out.println("Making Sound");
	}
}
class Cat extends Animal{
	@Override
	public void makesound() {
		System.out.println("bark");
	}
}

public class Question1 {
	
	public static void main(String[] args) {
	Animal a = new Animal();
	a.makesound();
	
	Cat c = new Cat();
	c.makesound();

	}

}