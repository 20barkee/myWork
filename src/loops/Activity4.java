package loops;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int limit;
		System.out.println("How high would you like to count to?");
		limit = input.nextInt();
		int num = 0;
		int sum = 0;
		while (num <= limit) {
			sum = sum + num;
			num = num + 2;
		}
		System.out.println(sum);
	}
}