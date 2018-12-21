package multiArrays;

import java.util.Scanner;
import java.util.Random;

public class RollaDice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("How many students are in the class");
		int studRows = input.nextInt();
		System.out.println("How many sides does the die have?");
		int max = input.nextInt();
		System.out.println("How many times should each student roll the die?");
		int rollsCol = input.nextInt();
		System.out.println("What number would you like to keep track of?");
		int track=input.nextInt();

		int min = 1;
		int numRolls = 0;
		int times=0;

		int[][] numbers = new int[studRows][rollsCol];
		for (int rows = 0; rows < numbers.length; rows++) {
			for (int columns = 0; columns < numbers[0].length; columns++) {
				numbers[rows][columns] = min + generator.nextInt(max - min + 1);
				if(numbers[rows][columns]==track) {
					times++;
				}
				System.out.println(numbers[rows][columns]);
				numRolls = studRows * rollsCol;

			}

		}
		System.out.println("The die was rolled " + numRolls + " times");
		System.out.println("The number " + track + " was rolled " + times + " times");
	}

}
