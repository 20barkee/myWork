package mathOperators;

import java.util.Scanner;


public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= -999;
		int ssn1=-999;
		int ssn2=-999;
		int ssn3=-999;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("How old are you?");
		age=input.nextInt();
		
		System.out.println("Please enter the first three digits of your social security number.");
		ssn1= input.nextInt();
		
		System.out.println("Please enter the next two digits of your social security number.");
		ssn2= input.nextInt();
		
		System.out.println("Please enter the last four digits of your social security number.");
		ssn3= input.nextInt();
		
		
		
		int tillLegal= 18-age;
		

		
		System.out.println("You are " + age +" years old.");
		System.out.println("There are " +tillLegal+ " years till you are 18");
		System.out.println("Your social security number is " + ssn1 + " " + ssn2 +" " + ssn3+ " "+ ".");
		System.out.println("The last four digits of your ssn are " + ssn3);
		
		
		

	}

}
