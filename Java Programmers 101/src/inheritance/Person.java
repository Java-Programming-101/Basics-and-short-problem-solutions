package inheritance;

public abstract class Person {
	private String name, birthdate;

	public Person(String personName, String personBirthdate) {
		name = personName;
		birthdate = personBirthdate;		
	}
	
	public Person(){
		this("Default name", "Default Birthdate");
	}
	
	public Person(String personName){
	     this(personName, "Default Birthdate");
	}
	
	public String getName() {
		return name;
	}

	public String getBirthdate() {
		return birthdate;
	}
	
	public void setName (String input){
		this.name = input;
	}
	
	public void setBirthdate(String input) {
		this.birthdate = input;
	}
	
	public abstract void printInfo();
	
	
	
	// The abstract method does not declare how the method will be implemented. 
	// It simply tells the class that extends the person class that it MUST implement 
	// a printInfo Method.
	//public abstract void printInfo();
	

}
