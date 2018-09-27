package mathOperators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double pi = Math.PI;

double radius = -999.0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the radius of the circle?");
		radius= input.nextDouble();
		
		
		System.out.println("The area of the cirlce is : " + radius * radius * pi);
		
		input.close();

	}

}
