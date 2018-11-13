package decisionStructres;
//import java.util.Scanner;
public class Circle {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
		
private double radius;
public Circle()
{
	radius=-999;
}
public Circle(double newRadius)
{
	radius=newRadius;
}

public double getRadius()
{
	return radius;
}
public double circumference()
{
	double circumference= 2*radius*Math.PI;
	return circumference;
}
public double area()
{
	return Math.PI* radius*radius;
}
	public void setRadius(double xRadius)
	{ 
		radius=xRadius;
	}
}


