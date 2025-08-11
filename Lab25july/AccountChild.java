package Lab25july;

public class AccountChild implements Account1 {
	@Override
	public void deposit(double amo) {
		System.out.println("Details");
	}
	@Override
	public void withdraw(double amo) {	
	}

	@Override
	public double calculateInterest() {
		return 0;
	}

	@Override
	public void viewBalance() {
	}

	public static void main(String[] args) {
		
	    SavAcc sa = new SavAcc();
        sa.deposit(500);
        sa.withdraw(600);
        sa.viewBalance();
        System.out.println("Interest on Savings: " + sa.calculateInterest());

        CurAcc ca = new CurAcc();
        ca.deposit(10);
        ca.withdraw(1000);
        ca.viewBalance();
        System.out.println("Interest on Current: "+ ca.calculateInterest());
       

		// TODO Auto-generated method stub

	}
}


