package innerClass;

public class Main {

	

	public static void main(String[] args) {
		
		
		
		
		// example 1 
		
		
		CreatingInnerFromOuterClass example1 = new CreatingInnerFromOuterClass();
		example1.createInner();
		
		
		
		MyOuterClassDemo myOuterClassDemo = new MyOuterClassDemo();
		
		
		
		MyOuterClassDemo.MyInnerClassDemo inner = myOuterClassDemo.new MyInnerClassDemo();
		inner.seeOuter();
	}

}
