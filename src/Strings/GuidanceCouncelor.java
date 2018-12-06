package Strings;

import java.util.Scanner;

public class GuidanceCouncelor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Boolean yesOrNo=true;
		String Williams=null;
		while(yesOrNo==true) {
		System.out.println("What is your last name?");
		String name=input.nextLine();
		if(name.charAt(0)<='A'&&name.charAt(0)>='G') {
			String list=Williams+name;
		}
		if(name.charAt(0)<='H'&&name.charAt(0)>='N') {
			
		}
		if(name.charAt(0)<='0'&&name.charAt(0)>='S') {
			
		}
		if(name.charAt(0)<'S'&&name.charAt(0)>='Z') {
			
		}
		System.out.println("Would you like to enter another name? (True or false?)");
		yesOrNo=input.nextBoolean();
		
		}
		System.out.println(list);
	}

}