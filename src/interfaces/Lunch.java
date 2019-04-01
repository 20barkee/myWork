package interfaces;

public class Lunch implements Meal{
private boolean school;
private int prepTime;
private int calories;

public Lunch() {
	school=false;
	prepTime=100;
	calories=10;
}
//public boolean hadEggs(); (FIX LATER)

public int getCalories() {
	return calories;
}
public String toString() {
	return "Lunch Object: School: " + school + "Prep Time: "+ prepTime +" Calories: " + calories;
}
public boolean equals(Object anObject) {
	return (this.toString().equals(anObject.toString()));
}
}
