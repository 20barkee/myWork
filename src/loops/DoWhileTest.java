package loops;
import java.util.Scanner;
public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);


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
