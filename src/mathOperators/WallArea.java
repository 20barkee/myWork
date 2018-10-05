package mathOperators;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length = -999.0;
		double width = -999.0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the lenght (in feet) of the wall? (EX: If the wall is 34 ft type in 34)");
		length = input.nextDouble();
		
		System.out.println("What is the width of the wall (in feet)? (EX: If the wall is 34 ft type in 34)");
		width= input.nextDouble();
		
		
		System.out.println("The area of the wall is: " + length * width);

		
		input.close();

	}

}
