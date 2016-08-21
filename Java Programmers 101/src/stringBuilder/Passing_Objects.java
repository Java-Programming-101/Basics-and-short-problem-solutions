package stringBuilder;

public class Passing_Objects {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		StringBuilder oBuilder = new StringBuilder();
		
		oBuilder.append(person.name);
		oBuilder.append(person.age);
		
		System.out.println(oBuilder);
		

	}

}
