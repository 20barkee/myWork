package loops;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = 0;
		int counter = 0;
		int sum = 0;
		System.out.println("Please enter a positive integer.");
		num = input.nextInt();
		
		
		for (counter = 1; counter < num; counter = counter + 2) {

			sum = sum + counter;
			//have to add the counter and not num!!!!!

		}
		System.out.println("The sum of all of the odd numbers less than " + num+ " is " +sum);
	}

}
