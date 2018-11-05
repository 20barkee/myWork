package decisionStructres;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

int salary=0;
System.out.println("What is your salary?");
salary= input.nextInt();


if (salary<20000)
{
	System.out.println("You must be a worker.");
}
else
{
	if (salary<=40000)	
	{
		System.out.println("You must be a manager.");
	}
	if(salary<100000)
		System.out.println("You must be a CEO.");
}
	if(salary>=100000)
		System.out.println("You must be the owner.");
}

}
