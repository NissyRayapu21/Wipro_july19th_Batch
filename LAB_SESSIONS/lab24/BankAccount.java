package lab24;
abstract class BankAccount {

	
	    String accountNumber;
	    double balance;

	    BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    abstract double calculateInterest();

	    void printBalance() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	    }
	}

	// SavingsAccount class
	class SavingsAccount extends BankAccount {
	    SavingsAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    double calculateInterest() {
	        return balance * 0.04;
	    }
	}

	// FixedDepositAccount class
	class FixedDepositAccount extends BankAccount {
	    FixedDepositAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    double calculateInterest() {
	        return balance * 0.065;
	    }
	


	}


