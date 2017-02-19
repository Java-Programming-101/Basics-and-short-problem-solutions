package java101_interface;

public class Withdrawal extends Transaction {
	
	double Amount;
	
	@Override
	public void process(){
		System.out.println("You did not withdraw anything.");
	}
	
	public void process(double amount) {
		
		this.AmountInAccount = this.AmountInAccount - amount;
		System.out.println("You withdrew "+ amount + " Your balance is "+ this.AmountInAccount);
		
	}

}
