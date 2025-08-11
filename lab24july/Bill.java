package lab24july;

abstract class Bill {
	//method
	    abstract void generateBill();
	}
//sub1
	class EleBill extends Bill {
	    @Override
	    void generateBill() {
	        System.out.println("Electricity bill generated.");
	    }
	}
	//sub2

	class WBill extends Bill {
	    @Override
	    void generateBill() {
	        System.out.println("Water bill generated.");
	    }
	
	}	


