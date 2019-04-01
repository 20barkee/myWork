package interfaces;

public class Dinner implements Meal{
private String protein;
private String dessert;
private int calories;

public Dinner() {
	protein="Shrimp";
	dessert= "Ice Cream";
	calories=10009;
	
}

public String forDessert();

public int getCalories() {
	return calories;
}
public String toString() {
	return "Dinner Object: Protein: "+protein + " Dessert: "+ dessert + " Calories: "+ calories;
}
}
