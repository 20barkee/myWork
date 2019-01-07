package review;

import java.util.Scanner;

public class Part2of4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Part2of4thing[][] bob = new Part2of4thing[7][5];

		String name;
		int grade;
		int nameSum = 0;
		int num9th = 0;
		double num12th = 0;

		for (int row = 0; row < bob.length; row++) {
			for (int col = 0; col < bob[0].length; col++) {
				System.out.println("Please enter in the students name");
				name = input.nextLine();
				System.out.println("Please enter in the students grade");
				grade = input.nextInt();

				// clear the buffer
				input.nextLine();

				bob[row][col] = new Part2of4thing(name, grade);

				nameSum += name.length();
				if (grade == 9) {
					num9th++;
				}
				if (grade == 12) {
					num12th++;
				}
			}

		}
		double percent12th=num12th/35.0;
		
		System.out.println("The average length of student names is " + nameSum / 35);
		System.out.println("The number of ninth graders are " + num9th);
		System.out.println("The percentage of 12th graders is"+ " " + percent12th*100 + "%");
	}

}
