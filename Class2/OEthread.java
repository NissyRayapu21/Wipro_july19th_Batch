package Class2;



public class OEthread {

	public static void main(String[] args) {
		OddEvenLab even = new OddEvenLab();
	        OddThread odd = new OddThread();

	        even.start();
	        odd.start();
	    }
	}


