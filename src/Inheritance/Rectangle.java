package Inheritance;

public class Rectangle extends Parallelogram implements Geo{
//just calling the super class constructors

public Rectangle() {
super();
}
public Rectangle(double length, double width) {
	//just need to call the super class constructor and pass in the paratmeters to set to s1, s2...
super(length, width, width);
	
}
//public double area() {
	//cant call the super for this as there is no area method
	//return super.getSide1()*super.getSide3();
//DONT need area method as it is already in parallelogram
//}
@Override
public double perimeter() {
	// TODO Auto-generated method stub
	return 0;
}
}

