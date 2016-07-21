package lambda;

import java.util.ArrayList;
import java.util.List;

public class Simple_Lambda {
	
	/*
	 * **look in Animal class**
	 * 
	 * Here we have a basic Animal class with 3 instance variables
	 * which are set in the constructor.
	 * 2 methods that get the state of whether the animal can hop or swim.
	 * and a toString() method so we can easily identify the Animal in programs.
	 */

	/*
	 * ** look in CheckTrait ** 
	 * We plan to write a lot of different checks so we want an interface.
	 */
	
	
	
	/* ** look in CheckIfHopper **
	 * The first thing we want to check is if an animal can hop so we implement 
	 * a class that can check this. 
	 */
	

	
	/*
	 * This is a simple class so far, this is part of the problem lambdas help us solve.
	 */
	
	
	public static void main(String[] args) {
		
		  
		List <Animal> animals= new ArrayList<Animal>();
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, new CheckIfHopper());
//		print(animals, a -> a.canHop());
//		print(animals, a -> a.canSwim());
//		print(animals, a -> !a.canSwim());

	}
	
	private static void print( List<Animal> animals, CheckTrait checker){
		for (Animal animal : animals){
			if(checker.test(animal)){
				System.out.println(animal);
			}
		}
	}

/*
 * The print method is very general, it can check for any trait. This is a good design, It shouldn't
 * need to know what specifically we are searching for in order to print a list of animals. 
 * 
 * What happens if we need to print the animals that swim? 
 * 
 * - We need to create a CheckIfSwims class.
 * - We need to add a new line under line 45 to instantiate the class.
 * 
 * not such a big deal here but this is where lambdas become useful. rather than creating a new class and instanciating that class,
 * we can replace line 46 with 
 * print(animals, a -> a.canHop());
 */
	
	
}

