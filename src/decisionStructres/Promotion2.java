package decisionStructres;

import java.util.Scanner;

public class Promotion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int age;
		double years;
		double height;

		System.out.println("What is your age?");
		age = input.nextInt();

		if (age >= 50) {
			System.out.println("How many years have you worked for the company?");
			years = input.nextDouble();

			if (years == 10.5) { //can't compare doubles so change this 
				System.out.println("What is your height in inches?");
				height = input.nextDouble();

				if (height < 70 || height > 80) {
					System.out.println("Congrats you get a promotion.");
				}
			} else {
				System.out.println("Sorry, no promotion for you :(");
			}
		}
		if (age < 50) {
			System.out.println("What is your height?");
			height = input.nextDouble();

			if (height >= 70 && height < 80) {
				System.out.println("Congrats you get a promotion.");
			}

			else {
				System.out.println("Sorry, no promotion for you :(");
			}
		}

	}

}
