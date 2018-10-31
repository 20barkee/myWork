package decisionStructres;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double test1;
		double test2;
		double test3;
		char grade;

		System.out.println("Enter test 1 score");
		test1 = input.nextDouble();
		System.out.println("Enter test 2 score");
		test2 = input.nextDouble();
		System.out.println("Enter test 3 score");
		test3 = input.nextDouble();

		double average = (test1 + test2 + test3) / 3;

		if (average >= 92.5) {
			System.out.println(grade = 'A');
		}
			else
			{
			if (average <= 92.5 && average > 84.5) {
				System.out.println(grade = 'B');
			}

			if (average <= 84.5 && average > 77.5) {
				System.out.println(grade = 'C');
			}
			if (average <= 77.5 && average > 69.5) {
				System.out.println(grade = 'D');
			}
			if (average <= 69.5) {
				System.out.println(grade = 'F');
			}
			
		}
	
	}

	}


