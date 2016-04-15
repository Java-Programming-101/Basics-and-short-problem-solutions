package inheritance;


public class Student extends Person{
	String subject;
	
	public Student(String name, String birthDate, String subject)
	{
		
		super(name, birthDate); // Calls the constructor from the super class Person
		this.subject=subject;
	}

	@Override
	public void printInfo() {
		System.out.println("I am a Student.");
		
	}


}
