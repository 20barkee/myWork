package inputExample;

import java.util.Scanner;

public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumbers = -999;
		int secondNumbers = -999;
		int thirdNumbers = -999;
		Scanner input =new Scanner(System.in);
		System.out.println("What is the first number of your locker combination?");
		firstNumbers= input.nextInt();
		System.out.println("What is the second number of your locker combination?");
		secondNumbers = input.nextInt();
		System.out.print("What is the third number of your locker combination?");
		thirdNumbers =input.nextInt();
		
		System.out.println("Your locker combination is " + firstNumbers + "-" + secondNumbers + "-" + thirdNumbers);
	 input.close();

	}

}
