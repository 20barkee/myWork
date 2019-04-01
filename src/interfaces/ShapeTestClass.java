package interfaces;
import java.util.Scanner;
public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("Length of rectangle");
		double length=input.nextDouble();
		
		System.out.println("Width of rectangle");
		double width=input.nextDouble();
		
		Shape bob = new Rectangle(length, width);
		
		System.out.println("The area of the rectangle is: " +bob.area());
		System.out.println("The perimeter of the rectangle is: "+ bob.perimeter());
		
		//cant use getLength, for example, is because it is not part of the filter 
		
		System.out.println("What is the radius of the circle?");
		double radius=input.nextDouble();
		
		Shape fred= new Circle(radius);
		
		System.out.println("The perimeter of the circle is: " + fred.perimeter());
	
		Shape thing= new Rectangle();
		Shape box=new Rectangle();
		
		thing= box;
	}

}
