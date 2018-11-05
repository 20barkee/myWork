package decisionStructres;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double testAverage;
		double homeworkAverage;
		boolean nice;

		System.out.println("What is your test average?");
		testAverage = input.nextDouble();
		System.out.println("What is your homework average?");
		homeworkAverage = input.nextDouble();
		System.out.println("Is your teacher nice? (Please enter in true or false)");
		nice = input.nextBoolean();

		if (nice == true) {
			if (testAverage > homeworkAverage) {
				System.out.println("Your grade is " + testAverage);
			} else {
				System.out.println("Your grade is " + homeworkAverage);
			}
		}
		if (nice == false) {
			if (testAverage < homeworkAverage) {
				System.out.println("Your grade is " + testAverage);
			} else {
				System.out.println("Your grade is " + homeworkAverage);
			}
		}

	}
}
