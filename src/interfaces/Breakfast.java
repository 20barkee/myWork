package interfaces;

public class Breakfast implements Meal {
	private boolean eggs; 
	private String drink;
	private int calories;
	
	public Breakfast() {
		eggs=false;
		drink= "Lemonade";
		calories=1345;
	}
	public Breakfast(boolean xEggs, String xDrink, int xCalories) {
		eggs=xEggs;
		drink=xDrink;
		calories=xCalories;
	}
	public boolean getEggs() {
		return eggs;
	}
	public int getCalories() {
		return calories;
	}
	public String toString() {
		return "Breakfast Class: Eggs: " +eggs+ " Drink: " + drink + " Calories: " + calories;
	}
	public boolean equals(Object anObject) {
		return (this.toString().equals(anObject.toString()));
	}
	public Object clone() {
		return new Breakfast(eggs, drink, calories);
	}

}
