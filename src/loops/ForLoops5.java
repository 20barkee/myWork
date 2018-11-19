package loops;

import java.util.Scanner;

public class ForLoops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int num;
		
		System.out.println("How many hellos would you like?");
		num=input.nextInt();
		for (counter = 1; counter <=num; counter = counter + 1) {
			System.out.println("Hello " + counter);

		}
	}

}
