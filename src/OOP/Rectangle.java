package OOP;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = -999;
		width = -999;
		// want to initalize the variables
	}
	
	public Rectangle(double L, double W) {
		length=L;
		width=W;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public void setLength(double xLength) {
		length = xLength;
	}

	public void setWidth(double xWidth) {
		width = xWidth;
	}
}
