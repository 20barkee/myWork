package decisionStructres;

import java.util.Scanner;

public class FirstClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = -999;

		System.out.println("What is your age?");
		age = input.nextInt();

		System.out.println(age == 16);

	}
}
