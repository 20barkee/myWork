package Strings;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		String sentence=input.nextLine();
		int i=0;
		
		for(i=0; i<sentence.length(); i++)
		{
		
		
		if (sentence.charAt(i)!='a' && sentence.charAt(i)!=' ') {
			System.out.println(sentence.charAt(i));
		}
		}
	}}

//or
//String step1 = sentence.replaceAll(" ","");
//String step2 = step1.replaceAll("a","");


