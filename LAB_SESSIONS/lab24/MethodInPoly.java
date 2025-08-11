package lab24;

public class MethodInPoly {
	//base class
	class payment{
		void pay(){
			System.out.println("processing payment..");
			}
		
		}
	//child class1
	class creditcard extends payment{
		
		void pay() {
			System.out.println("payment using credit card");
		}
	}
	//child class2
	class upi extends payment{
		void pay() {
			System.out.println("payment  usinf upi");
		}
	}
	//child class3
	class netbanking extends payment{
		void pay() {
			System.out.println("payment using netbanking");
			
		}
		
	}
//main class
	
	public static void main(String[] args) {
		
	   payment p1= new creditcard();
		p1.pay();
     	payment p2= new upi()	;
	    p2.pay();
	    payment p3= new netbanking();
	    p3.pay();
	    
	}
	
		

		

	}


