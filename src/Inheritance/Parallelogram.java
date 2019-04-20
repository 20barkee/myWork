package Inheritance;

public class Parallelogram extends Quadrilateral{
	double height;
	public Parallelogram() {
		super();
	}

	public Parallelogram(double length, double width, double xHeight) {
	
		super(length, width, length, width);
		height=xHeight;

	}

	public double area() {
		// cant call the super for this as there is no area method
		return super.getSide1() * height;
	}

	//public String toString(){
	//	return "Parallelogram Object: Height=" + height+ " Side1="+ super.getSide1()+ " Side2="+ super.getSide2()+ " Side3="+ super.getSide3()+ " Side4="+ super.getSide4(); 
//	}
	//or
	public String toString(){
	return "Parallelogram Object: Height= " + height + " "+ super.toString();
	}
	//can keep word "Quadrilateral" as it shows the inheritance model inside of it 

}



