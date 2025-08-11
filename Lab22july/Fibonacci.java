package Lab22july;
class Fibonacci{
	  public static void main(String[] args) {

	    int n = 10, f = 0, s = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(f + ", ");

	    
	      int nextTerm = f + s;
	      f = s;
	      s = nextTerm;
	    }
	  }
	}
