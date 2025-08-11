package corejavaone;

public class Hierarchical {
	//super class
	class Hierarchical{
		public void eat() {
			System.out.println("Animals eat food");
		}
	}

	
	//sub class1
	class Dog extends Hierarchical{
		public void bark() {
			System.out.println("Dogs baeks");
		}
	}
	
	//sub class2
	class Cat extends Hierarchical{
		public void meow() {
			System.out.println("Cat meow");
			
		}
	}
	//sub class 3
	class Cow extends Hierarchical{
		public void moos() {
			System.out.println("Cat meow");
		}
		
		//main class
	}
class Hierarchical{
	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.bark();
		
		Cat c= new Cat();
		c.eat();
		c.meow();
		
		Cow c1= new Cow();
		c1.eat();
		c1.moos();
		}
		
	}

}
