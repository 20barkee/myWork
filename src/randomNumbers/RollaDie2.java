package randomNumbers;

import java.util.Random;
import java.util.Scanner;
public class RollaDie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		Random generator=new Random();
		int min=1;
		int max=6;
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
	

		System.out.println("Please enter the number of rolls");
		int numRolls=input.nextInt();
		int randomNum=0;
		
for(int i=0; i<numRolls; i++)
{	
	randomNum=min+generator.nextInt(max-min+1);

	if(randomNum==1)
	{
		one++;
	}
	if(randomNum==2)
	{
		two++;
	}
	if(randomNum==3)
	{
		three++;
	}
	if(randomNum==4)
	{
		four++;
	}
	if(randomNum==5)
	{
		five++;
	}
	if(randomNum==6)
	{
		six++;
	}
	System.out.println(randomNum);
}

	

System.out.println("Ones=" + (one*100)/randomNum +"percent");
System.out.println("Twos=" + (two*100)/randomNum+"percent");
System.out.println("Threes=" + (three*100)/randomNum+"percent");
System.out.println("Fours=" + (four*100)/randomNum +"percent");
System.out.println("Fives=" + (five*100)/randomNum +"percent");
System.out.println("Sixes=" + (six*100)/randomNum +"percent");

	}
}


