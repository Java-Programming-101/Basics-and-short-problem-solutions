package inheritance;

public class Teacher extends Person implements myInterface{
	private String subjectITeach;
	
	public Teacher (String name, String birthdate, String subjectTaught){
		super(name, birthdate);
		this.subjectITeach = subjectTaught;
	}

	@Override // override the printInfo method from the Person class. as this is an abstract method it has no default implimentation. 
	public void printInfo() {
		System.out.println("I am a teacher. My name is " + this.getName() + "and i Teach "+ getSubjectTaught());
		
	}

	@Override
	public void doSomethingelse() {
		// notice that this is a method that the interface myInterface demands that we override.
		
	}

	@Override
	public String doSomething(Double number) {
		// notice that this is a method that the interface myInterface demands that we override.
		return "jsjs";
	}
	
	public String getSubjectTaught(){
		return this.subjectITeach;
	}



}
