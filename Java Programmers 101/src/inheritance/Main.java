package inheritance;



public class Main {
	

	
	public static void main(String[] args) {
     	//Person defPerson;
//		Person mike = new Person("Mike","11/02/1989");
//		Person marc = new Person("Marc");
		Student angela = new Student("Angela","20/02/1980", "JAVA");
		Teacher bob = new Teacher("Bob", "16/02/1990", "Java 101");

//		Receptionist reception = new Receptionist();
//
//		reseption.showInformation(angela);
//		reseption.showInformation(bob);


		Receptionist.showInformation(bob);
		Receptionist.showInformation(angela);
		
		bob.setName("not bob");

		Receptionist.showInformation(bob);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		Person abstractPerson = new Person("Abstract") {
//			
//			@Override
//			public void printInfo() {
//				System.out.println("I am an Abstract person ");
//				
//			}
//		};
//		
	}
	
	

}

