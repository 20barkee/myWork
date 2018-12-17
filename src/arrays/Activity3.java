package arrays;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);


		final int maxStudents = 5;
		double largest=0;
		double[] scores = new double[maxStudents];
		for (int i = 0; i < maxStudents; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
		
			 largest = scores[0];
			if (scores[i] > largest) {
				largest = scores[i];
			}

		}

		System.out.println("The largest score is " + largest);
	}

}


