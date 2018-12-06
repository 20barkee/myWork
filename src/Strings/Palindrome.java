package Strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

boolean repeat=true;
do {
	System.out.println("Please enter a word to find out if it is a palindrome.");
	String word=input.nextLine();
	
	String reverse="";
	for(int i=word.length()-1;i>=0;i--)
	{
		reverse=reverse+word.charAt(i);
	}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("no");
		}
		System.out.println("Again?");
		repeat=(input.nextLine().trim().equalsIgnoreCase("false")? false:true);
		//*
	}
	while(repeat);

	}
	}

