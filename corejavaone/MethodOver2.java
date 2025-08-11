package corejavaone;

public class MethodOver2 {
	public int add(int a,int b){
		int c=a+b;
		return c;
	}
	public int add(int a,int b,int c) {
		int d=a+b+c;
		return d;
		
	}
	//2 para
	public double add(double a,double b) {
		double c=a+b;
		return c;
	}
	public double add(double a,double b,double c) {
		double d=a+b+c;
		return d;
	}
	

	public static void main(String[] args) {
		
		MethodOver2 obj =new MethodOver2 ();
		System.out.println(obj.add(2, 5));
		System.out.println(obj.add(4, 5, 2));
		
		
	}

}
