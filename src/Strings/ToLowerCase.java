package Strings;

import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		System.out.println("Enter sentence");
		String sentence=input.nextLine();
		
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
	}

}
