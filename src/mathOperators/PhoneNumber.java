package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int areaCode =-999;
		int middle= -999;
		int last=-999;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the area code of the phone number");
		areaCode =input.nextInt();
		
		System.out.println("Please enter the middle three digits of the phone number");
		middle =input.nextInt();
		
		System.out.println("Please enter the last three digits of the phone number");
		last =input.nextInt();
		
		
		System.out.println("The complete phone number is " + areaCode+ " " + middle +" "+last);
		System.out.println("The area code is " + areaCode);
		System.out.println("The middle digits are " + middle);
		System.out.println("The last digits are " + last);
		
		input.close();
		

	}

}
