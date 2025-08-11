package Class2;

public class Prime {

  
        public static void main(String[] args) throws InterruptedException{
	        //sum primes from 1 to 10 using two threads
	    	SumPrimeLab t1 = new SumPrimeLab (1, 5);
	    	SumPrimeLab t2 = new SumPrimeLab(6, 10);

	        t1.start();
	        t2.start();

	        // wait for both threads to finish
	        t1.join();
	        t2.join();

	        int ts = t1.getSum() + t2.getSum();

	        System.out.println("Sum of prime numbers 1 and 10: " + ts);
	    }
	

}