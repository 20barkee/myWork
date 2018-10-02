package mathOperators;

import java.util.Scanner;

public class Paint {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final double HEIGHT = 8.0;
	double width= -999.0;
	double length=-999.0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the width of the room?");
	width= input.nextDouble();
	
	System.out.println("What is the length of the room?");
	length= input.nextDouble();

	double surfaceArea= (HEIGHT*length*width)/2;
	
	double paintNeeded= surfaceArea/400;
	
	System.out.println( (int)paintNeeded + " gallon(s) of paint will be needed to paint the room.");
	input.close();
	
	
	
	
	}
}
