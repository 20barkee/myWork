package loops;

import java.util.Scanner;

public class HowManyDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = 2018;
		int howMany = 0;
		int num;
		int sum;

		System.out.println("Please enter a number");
		num = input.nextInt();
		sum = num;
		howMany = howMany + 1;
		do {

		

			System.out.println("Please enter a number");
			num = input.nextInt();
			sum = sum + num;

			howMany++;
		} while (sum < 2018); //this means that while the sum is less than 2018 it will go through the loop
		{
			System.out.println("There were " + howMany + " numbers entered.");
		}
	}

}