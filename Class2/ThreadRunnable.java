package Class2;

public class ThreadRunnable implements Runnable{

   public void run() {
	 //  System.out.println("Thread is running");
	   
	   System.out.println("Thread"+Thread.currentThread().getId()+" is running");
	}

}
