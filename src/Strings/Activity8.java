package Strings;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		
		System.out.println("Enter name1");
		String name1=input.nextLine();
		
		String UName1= name1.toUpperCase();
		System.out.println("Enter name2");
		String name2= input.nextLine();
		String UName2= name2.toUpperCase();
		
		int number=UName1.compareTo(UName2);
		if(number>0)
		{
			System.out.println(name2+ " comes first");
		}
		if(number<0)
		{
			System.out.println(name1 + " comes first");

		}
		if(number==0)
		{
			System.out.println("They are the same name");
		}
	}

}
