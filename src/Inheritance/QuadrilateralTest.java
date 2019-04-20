package Inheritance;

import java.util.ArrayList;

import interfaces.Fish;
import interfaces.GoldFish;

public class QuadrilateralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrilateral bob = new Quadrilateral();
		Rectangle shape = new Rectangle(10, 20);
		Trapezoid joe = new Trapezoid(5, 2, 6, 8, 5);
		Square john = new Square(5);

		bob.setSide1(1);
		bob.setSide2(2);
		bob.setSide3(3);
		bob.setSide4(4);

		System.out.println("The perimeter of the quadrilateral is: " + bob.getPerimeter());

		shape.setSide1(4);
		shape.setSide2(435);
		shape.setSide3(323456);
		shape.setSide4(456);
		System.out.println("The area of the rectangle is " + shape.area());

		System.out.println("The area of the trapezoid is " + joe.area());
		System.out.println("The area of the square is " + john.area());

		ArrayList<Geo> lotsOfShapes = new ArrayList<Geo>();

		Rectangle rec = new Rectangle(1, 1);
		lotsOfShapes.add(rec);

		Rectangle rec2 = new Rectangle(88, 99);
		lotsOfShapes.add(rec2);

		Trapezoid trap = new Trapezoid(2, 6, 6, 6, 8);
		lotsOfShapes.add(trap);

		Trapezoid trap2 = new Trapezoid(8, 99, 100, 42, 23);
		lotsOfShapes.add(trap2);

		Parallelogram par= new Parallelogram(23,57,324);
		
		double maxArea = 0;
		boolean isRectangle = false;
		for (Geo b : lotsOfShapes) {
			if (b.area() > maxArea) {
				maxArea = b.area();
				if (b instanceof Rectangle) {
					isRectangle = true;
				} else
					isRectangle = false;
			}

		}
		if (isRectangle == true) {
			System.out.println("The shape with the largest area is a rectangle. The largest area is: " + maxArea);
		}
		if (isRectangle == false) {
			System.out.println("The shape with the largest area is a trapezoid. The largest area is: " + maxArea);
		}
		System.out.println(par.toString());
	}


}
