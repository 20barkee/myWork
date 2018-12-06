package Strings;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your password?");
		String password=input.nextLine();
		
		System.out.println("Please verify the password by re-entering it");
		String maybePassword= input.nextLine();
		
		int number= password.compareTo(maybePassword);
		if(number==0)
		{
			System.out.println("Correct, that is the password.");
		}
		else {
			while(number!=0)
			{
				System.out.println("Please re enter the password");
				maybePassword=input.nextLine();
				
				number= password.compareTo(maybePassword);
				if(number==0)
				{
					System.out.println("Correct, that is the password.");
				}
			}
		}
	}

}
