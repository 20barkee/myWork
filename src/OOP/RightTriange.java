package OOP;

public class RightTriange {
	private double base;
	private double height;

	public RightTriange() {
		base = -999;
		height = -999;
	}

	public RightTriange(double xBase, double xHeight) {
		base = xBase;
		height = xHeight;
	}

	public double Hypot() {
		return Math.hypot(base, height);
	}

	public double perimeter() {
		return base + height * (Math.hypot(base, height));
	}

	public double area() {
		return base * height / 2;
	}
}
