package arrays;

import java.util.Scanner;

public class Assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numFriends = 3;
		Assessment2TestClass[] bob = new Assessment2TestClass[numFriends];`

		String name;
		int age;
		for (int i = 0; i < numFriends; i++) {
			System.out.println("Please enter the name of your friend");
			name = input.nextLine();
			System.out.println("Please enter the age of your friend");
			age = input.nextInt();

			input.nextLine();
			bob[i] = new Assessment2TestClass(name, age);

		}
		for (int j = numFriends - 1; j >= 0; j--) {
			System.out.println(bob[j].getName());
			System.out.println(bob[j].getAge());
		}

	}

}
