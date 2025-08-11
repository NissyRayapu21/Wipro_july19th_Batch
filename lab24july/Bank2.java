package lab24july;

public class Bank2 {


	    public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("SA123", 100);
	        FixedDepositAccount fda = new FixedDepositAccount("FD456", 200);

	        sa.printBalance();
	        System.out.println("Savings Account Interest: ₹" + sa.calculateInterest());

	        System.out.println();

	        fda.printBalance();
	        System.out.println("Fixed Deposit Interest: ₹" + fda.calculateInterest());
	    }
	
	}


