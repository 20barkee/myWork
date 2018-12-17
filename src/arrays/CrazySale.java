package arrays;

import java.util.Scanner;
import java.util.Random;

public class CrazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);

		final int numItems = 5;
		int min = 0;
		int max = 100;
		double percent = 0;
		double newCost = 0;

		double[] cost = new double[numItems];

		for (int i = 0; i < numItems; i++) {
			double randomNum = (Math.random() * ((max - min) + 1)) + min;
			System.out.println("Enter the cost of of the item.");
			cost[i] = input.nextDouble();

			percent = randomNum / 100;
			cost[i] = cost[i] * percent;

			System.out.println("After the sale, the new cost of the item is $" + cost[i]);
		}

	}

}
