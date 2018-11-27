package randomNumbers;

import java.util.Random;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random generator=new Random();
	Scanner input=new Scanner(System.in);
		
		int min=0;
		int max=0;
		int times=0;
		int randomNum=0;
		int winning=0;
		
		
		System.out.println("What is are the four winning lottery numbers?");
winning=input.nextInt();

System.out.println("What is the low range");
min=input.nextInt();
System.out.println("What is the high range?");
max=input.nextInt();
		
		while(randomNum!=winning)
{
	randomNum=min+generator.nextInt(max-min+1);
	times++;

}
		System.out.println("The winning number is " +randomNum);
System.out.println("It took "+ times +" tries to guess the lottery number");

	}

}
