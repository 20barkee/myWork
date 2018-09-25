package inputExample;

import java.util.Scanner;

public class generatePassworf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int firstNumber = -999;
	int secondNumber= -999;
	int thirdNumber = -999;
	Scanner input =new Scanner(System.in);
	System.out.println("This is a password gererator");
	
	System.out.println("Please enter a number 1-9.");
	firstNumber= input.nextInt();
	System.out.println("Please enter another number 1-9.");
	secondNumber = input.nextInt();
	System.out.print("Please enter a final number 1-9.");
	thirdNumber =input.nextInt();
	
	
	System.out.println("Here are three possibe passwords with the given numbers:");
	System.out.println("1) " +  firstNumber + "-" + secondNumber + "-" +  thirdNumber);
	System.out.println("2) "  +  thirdNumber + "-" + firstNumber + "-" + secondNumber);
	System.out.println("3) "   + secondNumber + "-" + thirdNumber + "-" + firstNumber);
	System.out.println("You're Welcome.");
	input.close();

}

}
