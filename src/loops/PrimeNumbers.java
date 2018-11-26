package loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int number;
		int counter = 0;
		int truthNumber=0;
		System.out.println("Please enter a positive integer.");
		number = input.nextInt();
		
if(number==0 ||number==1)
{
	truthNumber=1;
}
if(number==2)
{
	truthNumber=2;
}

		// the first and only even prime number is 2
		for (counter = 2; counter <= number / 2; counter++) {
			if(number%counter==0)
			{
				truthNumber=1;
			}
			else
			{
				truthNumber=2;
			}
		}
			
			if(truthNumber==1)
			{
				System.out.println("That is not a prime number");
			}
			if(truthNumber==2)
			{
				System.out.println("That is a prime number");
			}
		
		
	}
}
