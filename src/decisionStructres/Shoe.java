package decisionStructres;

import java.util.Scanner;

public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height;
		double shoeSize;

		System.out.println("What is your height");
		height = input.nextDouble();
		System.out.println("What is your shoe size?");
		shoeSize = input.nextDouble();

		double sum = height + shoeSize;

		System.out.println(sum >= 26);

		System.out.println(height < 26 && shoeSize > 9);
		
	}
}
