package inputExample;

import java.util.Scanner;

public class BetterLockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber = -999;
		int secondNumber= -999;
		int thirdNumber = -999;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please enter the first set of two digit numbers from your locker combanation.");
		firstNumber= input.nextInt();
		System.out.println("Please enter another number two digit numbers from your locker combination.");
		secondNumber = input.nextInt();
		System.out.print("Please enter a final set of two digit numbers from your locker combanation");
		thirdNumber =input.nextInt();
		
		
		System.out.println("Here is your locker combanation:");
		System.out.println(firstNumber + "-" + secondNumber + "-" +  thirdNumber);
	
		System.out.println("You're Welcome.");
		input.close();


	}

}
