package Strings;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a sentence");
		String sentence=input.nextLine();
		
		System.out.println("There are " + sentence.length() +" charaters in that sentence.");
	}

}
