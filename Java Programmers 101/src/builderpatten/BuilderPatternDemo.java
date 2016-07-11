package builderpatten;

public class BuilderPatternDemo {
	
    public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: $"+ vegMeal.getCost());
	
		Meal NonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNonVeg Meal");
		NonVegMeal.showItems();
		System.out.println("Total cost: $"+ NonVegMeal.getCost());
    }

}
