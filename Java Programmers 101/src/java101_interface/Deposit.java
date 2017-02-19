package java101_interface;

public class Deposit extends Transaction{
	
	double Amount;
	
	@Override
	public void process(){
		System.out.println("Enter an amount to Deposit");
	}

	public void process(double amount) {
		
		this.AmountInAccount = this.AmountInAccount + amount;
		System.out.println("you deposited "+ amount + " your balance is "+ this.AmountInAccount);
	}
}
