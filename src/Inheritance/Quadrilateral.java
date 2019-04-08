package Inheritance;

public class Quadrilateral {
private double side1;
private double side2;
private double side3; 
private double side4;

public Quadrilateral(){
	side1=0;
	side2=0;
	side3=0;
	side4=0;
	
}
public Quadrilateral(double xSide1, double xSide2, double xSide3, double xSide4) {
		side1=xSide1;
		side2=xSide2;
		side3=xSide3;
		side4=xSide4;
	}

public double getSide1() {
	return side1;
}
public double getSide2() {
	return side2;
}
public double getSide3() {
	return side3;
}
public double getSide4() {
	return side4;
}
public void setSide1(double zSide1) {
	side1=zSide1;
}
public void setSide2(double zSide2) {
	side2=zSide2;
}
public void setSide3(double zSide3) {
	side3=zSide3;
}
public void setSide4(double zSide4) {
	side4=zSide4;
}
public double getPerimeter() {
	return (side1 + side2+ side3+ side4)/4;
}
}
