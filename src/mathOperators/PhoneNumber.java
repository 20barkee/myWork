package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int phoneNumber;
		int areaCode;
		int middleThree;
		int lastFour;
		int middleThree2;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your phone number.");
		phoneNumber=input.nextInt();
		
		lastFour= phoneNumber % 10000;
		areaCode= phoneNumber/ 10000000;
		middleThree= (phoneNumber- areaCode) /10000;
		middleThree2= middleThree % 1000;
		
		
		System.out.println("The complete phone number is " + phoneNumber);
		System.out.println("The area code is " + areaCode);
		System.out.println("The middle digits are " + middleThree2);	
		System.out.println("The last digits are " +lastFour);
		
		input.close();
		

	}

}
