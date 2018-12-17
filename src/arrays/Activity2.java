package arrays;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double sum = 0;
		final int maxStudents=5;
		double[] scores = new double[maxStudents];
		for (int i = 0; i < maxStudents; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
	
		}
		for (int j=maxStudents-1;j>=0; j--) {
			//off by one error if no -1
			System.out.println(scores[j]);
		}


	}

}
