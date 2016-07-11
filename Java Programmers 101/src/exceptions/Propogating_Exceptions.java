package exceptions;

public class Propogating_Exceptions {

	public static void main(String[] args) {
		Propogating_Exceptions propEx = new Propogating_Exceptions();
		
		
		propEx.A();
		
	}
	
	public void A() {
		B();
		
	}
	public void B() {
		C();
	}
	public void C() {
		D();
	}
	public void D() {
		int[] numbers = {0,1,2,3,4};
		System.out.println(numbers[5]);
	}

}
