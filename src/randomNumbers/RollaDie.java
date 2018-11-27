package randomNumbers;

import java.util.Random;
import java.util.Scanner;
public class RollaDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		Random generator=new Random();
		int min=1;
		int max=13;
		int multiple=0;
	
		
		System.out.println("Please enter in the number of sides on the die");
		int numSides= input.nextInt();
		//max
		
		System.out.println("Please enter the number of rolls");
		int numRolls=input.nextInt();
		
		max=numSides;
		
		int randomNum=0;
for(int i=0; i<numRolls; i++)
{	
	randomNum=min+generator.nextInt(max-min+1);
System.out.println(randomNum);
}

	
	}

}
