package Lab25july;

public class Temp {
	 private double celsius;

	    // Set temperature 
	    public void setCelsius(double cel) {
	        if (cel >= -273) {  // Absolute zero validation
	            this.celsius = cel;
	        } else {
	            System.out.println("Invalid temperature (-273°C)");
	        }
	    }
	    public double toFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }

	    public double toKelvin() {
	        return celsius + 273;
	    }
	    public void display() {
	        System.out.println("Celsius: " + celsius);
	        System.out.println("Fahrenheit: " + toFahrenheit());
	        System.out.println("Kelvin: " + toKelvin());
	    }

	public static void main(String[] args) {
		 {
			 //f
		        Temp t1 = new Temp();
		        t1.setCelsius(25);
		        t1.display();
		  //s

		        Temp t2 = new Temp();
		        t2.setCelsius(10); 
		        t2.display();// Invalid: Below absolute zero
		       


	}

	}
}
