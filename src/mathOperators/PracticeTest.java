package mathOperators;

import java.util.Scanner;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = -999;
		int month = -999;
		int day = -999;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the current year Ex: 2000");
		year= input.nextInt();
		System.out.println("Please enter the current month Ex: For the month of January type in 1");
		month= input.nextInt();
		System.out.println("Please enter the current day Ex: 22");
		day= input.nextInt();
		
		System.out.println("The Current Date is: " + month + "-" + day + "-" + year);

	}

}
