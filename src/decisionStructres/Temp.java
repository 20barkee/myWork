package decisionStructres;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp;

		System.out.println("What is the tempertature?");
		temp = input.nextInt();

		if (temp > 83) {
			System.out.println("It is clearly swimming temp.");
		}
			else {

			if (temp > 74 && temp <= 83) {
				System.out.println("It is tennis temp.");
			}
			if (temp > 35 && temp <= 71) {
				System.out.println("It is golf temp");
			}
			if (temp > -10 && temp <= 35) {
				System.out.println("It is snow shoeing temp");
			}

			if(temp<-10)
			{
				System.out.println("It is nothing temp.");
				
	
			}
			}
		
	}
}
