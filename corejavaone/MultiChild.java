package corejavaone;

public class MultiChild  {
	class A {
		
	}
	public void display() {
		System.out.println("class A");
	}
}
	class B extends A{
		public void display() {
			System.out.println("class B");
			
		}
		class C extends B{
			
		}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
