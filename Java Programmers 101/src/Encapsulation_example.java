
public class Encapsulation_example {
	

	   private String name;
	   private String idNum;
	   private int age;

	   public int getAge(){
	      return age;
	   }

	   public String getName(){
	      return name;
	   }

	   public String getIdNum(){
	      return idNum;
	   }

	   public void setAge( int newAge){
	      age = newAge;
	   }

	   public void setName(String newName){
	      name = newName;
	   }

	   public void setIdNum( String newId){
	      idNum = newId;
	   }
	
	   /*
	    * The public setXXX() and getXXX() methods are the access points of the instance variables of the Encapsulation_example class. 
	    * Normally, these methods are referred as getters and setters. 
	    * Therefore any class that wants to access the variables should access them through these getters and setters.
	    */
	   
	   
	   
	   
	   
		/*
		 * The variables of the EncapTest class can be accessed as below:
		 */

	public static void main(String[] args) {
	      Encapsulation_example encap = new Encapsulation_example();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());

	}

}
