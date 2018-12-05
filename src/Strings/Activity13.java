package Strings;

import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your social security number (no spaces or dashes)");
		String social = input.nextLine();

		System.out.println("The last four digits are " + social.substring(5));
		System.out.println("The middle two digits are " + social.substring(3, 5));
		System.out.println("The first three digits are " + social.substring(0, 3));
	}

}
