package Inheritance;

public class Trapezoid extends Quadrilateral implements Geo {
	private double height = 2;

	public Trapezoid() {
		super();
	}

	public Trapezoid(double base1, double base2, double slant1, double slant2, double xHeight) {
	//only have to pass 4 of the 5 parameters on
		super(base1, base2, slant1, slant2);
		height=xHeight;

	}

	public double area() {
		// cant call the super for this as there is no area method
		return ((super.getSide2() + super.getSide4()) / 2) * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
