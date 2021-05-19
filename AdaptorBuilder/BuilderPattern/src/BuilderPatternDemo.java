
public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		System.out.println();
			
		MealBuilder mealBuilder2 = new MealBuilder();
		Meal nonvegMeal = mealBuilder2.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonvegMeal.showItems();
		System.out.println("Total Cost: "+nonvegMeal.getCost());
	}
}
