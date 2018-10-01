package mathOperators;

import java.util.Scanner;

public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double length= -999.0;
		double width= -999.0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the length of the rectangle?");
		length= input.nextDouble();
		
		System.out.print("What is the width of the rectagle?");
		width= input.nextDouble();
		
		final double POSTIT= 9.0;
		
		double area= (length * width) / POSTIT;
		
		
		System.out.println("In order to cover the rectnangle, a person would need : " + area + "3 by 3 post-it notes.");
		input.close();

	}

}
