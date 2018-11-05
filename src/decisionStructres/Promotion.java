package decisionStructres;
import java.util.Scanner;
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		boolean sales;
		boolean delivery;
		int experience=0;
System.out.println("Are you a sales person (Please enter true or false)");
sales=input.nextBoolean();
System.out.println("Are you a delivery driver? (Please enter true or false)");
delivery= input.nextBoolean();
System.out.println("How many years of experience do you have?");
experience= input.nextInt();


if(sales== true && experience >= 3 || delivery== true && experience >= 5)
{
	System.out.println("Congrats, you are eligable for a promotion.");
}

	
	else
	{
		System.out.println("Sorry, you are not eligable for a promotion :(");
	}
}
}