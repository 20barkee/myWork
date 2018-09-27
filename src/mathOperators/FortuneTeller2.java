package mathOperators;

import java.util.Scanner;

public class FortuneTeller2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight = -999;
		int age= -999;
		int lucky= -999;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is your weight?");
		weight= input.nextDouble();
		
		System.out.println("How old are you?");
		age= input.nextInt();
		
		System.out.println("Pick a lucky number.");
		lucky= input.nextInt();
		
		System.out.println("You will kill " + weight + " people.");
		System.out.println("And " + lucky + age + " people will kill you.");
		
		input.close();
}
	
}
