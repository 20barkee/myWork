package loops;
import java.util.Scanner;
public class Divisors {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	
	int num;
	System.out.println("Please enter a positive integer.");
	num= input.nextInt();
	int counter=0;
	int numDivisors=0;
	
	for(counter=1; counter<=num; counter++)
	{
	
		if(num%counter==0)
		{
			numDivisors ++;
		}
		
	}
	System.out.println("The number of positive divisors that divide evenly into " +num + " are/is " + numDivisors);
}
}
