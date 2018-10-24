package OOP;

public class Circle {
	//instance fields
	private double radius;

	// default constructor
	public Circle() {
		radius = -999;
	}

	// alternate constructor
	public Circle(double newRadius) {
		radius = newRadius;
	}

	// Accessor Methods
	public double getRadius() {
		return radius;
	}

	public double circumference() {
		double circumference = 2 * radius * Math.PI;
		return circumference;
	}

	public double area() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	// mutator methods
	public void setRadius(double xRadius) {
		radius = xRadius;
	}
}