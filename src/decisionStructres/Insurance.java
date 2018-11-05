package decisionStructres;
import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	
	int age= 0;
	boolean smoke;
	double weight=0;
	double total= 100;
	
	System.out.println("How old are you?");
	age= input.nextInt();
	System.out.println("Do you smoke? (Please enter true or false)");
	smoke= input.nextBoolean();
	System.out.println("How much do you weigh");
	weight= input.nextDouble();
	
	if(age<75)
	{
		total= total+125;
	}
	if (age>30)
	{
		total= total-25;
	}
	if(weight>700)
	{ 
		total= total+300;
		
	}
	if (smoke=true)
	{
		total=total+50;
	}
	if(smoke= false)
	{
		total= total-40;
	}
	System.out.println("Your total is "+ total);
}
}
