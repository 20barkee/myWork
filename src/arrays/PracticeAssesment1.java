package arrays;

import java.util.Random;
import java.util.Scanner;

public class PracticeAssesment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 7;
		int max = 853;
		int numIntegers = 100;
		int userChoice = 0;
		int[] values = new int[100];
		boolean quit = true;
		int i = 0;
		int total = 0;
		int times = 0;

		for (i = 0; i < numIntegers; i++) {
			values[i] = min + generator.nextInt(max - min + 1);
		}

		while (quit == true) {
			System.out.println("What of the 100 numbers would you like to see?");
			userChoice = input.nextInt();

			System.out.println("The value at number " + userChoice + " is " + values[userChoice]);
			total = total + values[userChoice];
			System.out.println("Would you like to go again?");
			quit = input.nextBoolean();
			times++;
		}
		int average = total / times;
		System.out.println("The average of the values requested are " + average);
	}
}
