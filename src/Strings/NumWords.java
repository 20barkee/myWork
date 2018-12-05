package Strings;

import java.util.Scanner;

public class NumWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=0;
		int j=0;
		int numSpaces=0;
		boolean quit=false;
		System.out.println("Please enter a sentence");
		String sentence=input.nextLine();
			

		while(quit==false) {

	
		for(i=0; i<sentence.length(); i++)
		{
			if(sentence.charAt(i)==' ')
			{
				numSpaces=numSpaces+2;
			}
		}
		
		System.out.println("There are " +numSpaces +" words");
	
		System.out.println("Would you like to quit? Please enter true or false.");
		quit=input.nextBoolean();
		

			}
			}
		


	

}
