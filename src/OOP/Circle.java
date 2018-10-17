package OOP;

public class Circle {
	private double radius;

	public Circle() {
		radius = -999;
	}

	public double getRadius() {
		return radius;
	}

	public double circumference() {
		double circumference;
		return circumference = 2 * Math.PI * radius;
	}

	public double area() {
		double area;
		return area = Math.PI * (radius * radius);
	}
	


	public void setRadius(double xRadius) {
		radius= xRadius;
	}
}
//only need setter methods if there is an insance field for the object
