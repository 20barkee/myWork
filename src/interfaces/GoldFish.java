package interfaces;

public class GoldFish implements Fish{
private double length=0;
private int age=9;
private String color= "Blue";

public GoldFish(double xLength, int xAge, String xColor) {
	length=xLength;
	age=xAge;
	color=xColor;
}

public double getLength() {
	return length;
}

public String toString() {
	return "Goldfish length: " + length + " Goldfish age: " +age + " Goldfish color: " + color;
}

public String getColor() {
	return color;
}
	
	
}
