package mathOperators;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double change= -999.0;
		
		Scanner input =new Scanner(System.in);
	
	
		
		int  dollars;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		
		System.out.print("What is the number to make change from?");
		change= input.nextDouble();
		
		dollars= (int)change;
		change= change- dollars;
		quarters= (int)Math.floor((change/.25));
		change= change- .25*quarters;
	
		dimes= (int)Math.floor((change/.10));
		change= change -.10*dimes;
		
		nickles= (int)Math.floor((change/.05));
		change= change-.05*nickles;
				
				
		pennies= (int)Math.round((change/.01));
		change= change-.01*pennies;
		

		
		System.out.println("The number of dollars is: " + dollars);
		System.out.println("The number of quarters is: " +  quarters);
		System.out.println("The number of dimes is: " + dimes);
		System.out.println("The number of nickles is: " + nickles);
		System.out.println("The number of pennies is: " + pennies);
		input.close();
		
	}

}
