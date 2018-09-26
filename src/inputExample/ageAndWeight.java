package inputExample;

import java.util.Scanner;

public class ageAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = -999;
		double weight = -999.0;
		Scanner input =new Scanner(System.in);
		System.out.println("Please type in this order and on seperate lines your age and weight.");
		age = input.nextInt();
		weight = input.nextDouble();
		System.out.println("Your are " + age + " years old" + " and you weigh " + weight + " lbs.");
		
	 input.close();
	}

}
