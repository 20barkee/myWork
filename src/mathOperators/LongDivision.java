package mathOperators;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int divident= -999;
		int divisor= -999;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the divident?");
		divident= input.nextInt();
		
		System.out.print("What is the divisor?");
		divisor= input.nextInt();
		
		
		System.out.println("The divident divided by the divisior is " + divident / divisor + "." );
		System.out.println("The remainder is " + divident % divisor + ".");
		
		
		input.close();

	}

}
