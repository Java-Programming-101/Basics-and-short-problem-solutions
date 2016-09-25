package com.java101; // packages are always imported first.



public class ClassStructure_importStatements_packages {//followed by the class.

	public static void main(String[] args) {
		Person Marc = new Person();
		
		Marc.setname("Marc");
		
		System.out.println(Marc.getName());
		
		Person jason = new Person();
		
		jason.setname("Jason");
		
		System.out.println(jason.getName());
		
		NewClass aClass = new NewClass();
		
		System.out.println(aClass.getString());
		
	}

}


class NewClass{
	private String myString = "Hi";
	
	public String getString()
	{
		return this.myString;
	}
	
}

class Person{
	private String name;
	
	public void setname(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
}