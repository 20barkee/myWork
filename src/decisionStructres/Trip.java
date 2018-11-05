package decisionStructres;
import java.util.Scanner;
public class Trip {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int baseCost=200;
		int museum= 40;
		int zoo= 35;
		int people=0;
		int choice;
		int total;
		
		System.out.println("How many people are going on the trip?");
		people=input.nextInt();
		
		System.out.println("Please pick one activity to do:");
		System.out.println("1. Museum");
		System.out.println("2. Zoo");
		choice=input.nextInt();
		
		switch(choice)
		{
		case 1:
			total= (museum*people) + baseCost;
			System.out.println(total);
			break;
			
		case 2:
			total=(zoo*people)+baseCost;
			System.out.println(total);
			break;
		}
		
		
		
	}

}
