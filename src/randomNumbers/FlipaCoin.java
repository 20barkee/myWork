package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class FlipaCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int min = 1;
		int max = 2;
		int heads = 0;
		int randomNum = 0;
		double largest = 0;
		double smallest = 100;
		for (int j = 0; j < 1000; j++) {
			for (int i = 0; i < 100000; i++) {
				randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 1) {
					heads++;
				}
			}
			double headsPer = 100 * (heads / 100000.0);
//makes the number a percent

			if (headsPer > largest) {
				largest = headsPer;
			}
			if (headsPer < smallest) {
				smallest = headsPer;
			}
			heads = 0;
		}
		System.out.println(largest + " percent");
		System.out.println(smallest + " percent");

	}
}
