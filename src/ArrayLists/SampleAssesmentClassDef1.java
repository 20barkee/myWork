package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

import OOP.Friend;
import OOP.Rectangle;

public class SampleAssesmentClassDef1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name;
		int age = 0;
		int retierment = 0;

		ArrayList<Friend> bob = new ArrayList<Friend>();
		for (int i = 0; i < 2; i++) {
			System.out.println("Please enter in the name of your friend");
			name = input.nextLine();
			System.out.println("Please enter in the age of that friend");
			age = input.nextInt();

			// clear the buffer
			input.nextLine();

			bob.add(new Friend(name, age));

		}
		for (int j = bob.size() - 1; j >= 0; j--) {
			Friend temp = bob.get(j);
			System.out.println(temp.getName());
			if (temp.getAge() <= 65) {
				System.out.println("You have " + (65 - temp.getAge()) + " years until retirment");
			} else {
				System.out.println("You are aready at retierment age");
			}
		}
	}

}
