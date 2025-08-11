package Lab22july;

public class EvenArg {
	public static boolean isEven(int num) {
		return num%2==0;
	}

	public static void main(String[] args) {
		int testnum=8;
		if(isEven(testnum)) {
			System.out.println("is even");
		}else {
			System.out.println("is odd");
		}
		
	

	}

}
