package OOP;
import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("Length of rectangle?");
	double length= input.nextDouble();
	System.out.println("Width of rectangle");
	double width=input.nextDouble();
	Rectangle bob= new Rectangle(length, width);
	System.out.println("Area: " +bob.getArea());
	System.out.println("Perimeiter: " +bob.getPerimeter());
	
	
	System.out.println("Radius of cirlce?");
	double radius= input.nextDouble();
	Circle fred = new Circle(radius);
	System.out.println("Radius:" + fred.area());
	System.out.println("Radius:" + fred.circumference());
	
	System.out.println("Base of right triangle?");
	double base= input.nextDouble();
	System.out.println("Height of right triangle?");
	double height= input.nextDouble();
	RightTriange kevin= new RightTriange(base, height);
	System.out.println("Area: " + kevin.area());
	System.out.println("Perimeter: " + kevin.perimeter());
	
	}
}
