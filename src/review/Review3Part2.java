package review;

import java.util.Scanner;

public class Review3Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[687];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a student name in the following format: First Last");
			names[i] = input.nextLine();
		}

		System.out.println("Sudent info:");
		for (int j = 0; j < names.length; j++) {

			String firstName = names[j].substring(names[j].indexOf(" ") - 1, names[j].indexOf(" "));
			String lastName = names[j].substring(names[j].indexOf((" ")));
			int lastNameLength = lastName.length() - 1;
			System.out.println(firstName + " " + lastNameLength);
		}

	}


}
