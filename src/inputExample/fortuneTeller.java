package inputExample;

import java.util.Scanner;

public class fortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = -999.0;
		int age = -999;
		int luckyNumber = -999;
		Scanner input =new Scanner(System.in);
		System.out.println("How much do you weigh?");
		weight= input.nextDouble();
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.print("What is your lucky number?");
		luckyNumber =input.nextInt();
		
		
		System.out.println("I predict that...");
		System.out.println("You will die in hospital room number " + age + weight);
		System.out.println("and " + luckyNumber + " people will come to your funeral.");
		
	 input.close();

	}

}
