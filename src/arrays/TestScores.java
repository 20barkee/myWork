package arrays;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);


		final int maxStudents = 10;
		double largest=0;
		double lowest=0;
		double sum=0;
		double[] scores = new double[maxStudents];
		for (int i = 0; i < maxStudents; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
			
			sum+=scores[i];
			largest = scores[0];
			 lowest=scores[0];
			if (scores[i] > largest) {
				largest = scores[i];
			}

		}

		System.out.println("The largest score is " + largest);
		System.out.println("The lowest score is "+ lowest);
		System.out.println("The average of the test scores are " +sum/maxStudents);
	}
}
