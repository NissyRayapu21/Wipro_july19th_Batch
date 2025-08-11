package Lab25july;

public interface Account1 {
	 void deposit(double amo);
	    void withdraw(double amo);
	    double calculateInterest();
	    void viewBalance();
}
//cls1 SavingAcc
class SavAcc implements Account1 {
     double bal;
     double ir = 0.05;

    public void deposit(double amo) {
        bal+= amo;
        System.out.println("Deposited to Savings: " + amo);
    }

    public void withdraw(double amo) {
        if (amo <= bal) {
            bal = amo;
            System.out.println("Withdrawn from Savings: " + amo);
        } else {
            System.out.println("Insufficient balance in savings");
        }
    }

    public double calculateInterest() {
        return bal* ir;
    }

    public void viewBalance() {
        System.out.println(" Balance in saving: " + bal);
    }
}
//cls2 current
class CurAcc implements Account1 {
     double bal;
     double Limit = 10;

    public void deposit(double amo) {
        bal += amo;
        System.out.println("Deposited to Current: " + amo);
    }

    public void withdraw(double amo) {
        if (amo <= bal + Limit) {
            bal = amo;
            System.out.println("Withdrawn from Current: " + amo);
        } else {
            System.out.println("limit exceeded in Current Account.");
        }
    }

    public double calculateInterest() {
    	
        return 0; // No interest 
    }

    public void viewBalance() {
        System.out.println("Balance in current: " + bal);
    }
}


