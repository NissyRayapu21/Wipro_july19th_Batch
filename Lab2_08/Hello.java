package Lab2_08;



public class Hello  extends Thread {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
    	// create thread object
      
    	Hello th = new Hello(); 
        th.start(); // start the thread
    }
}

