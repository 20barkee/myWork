package loops;
import java.util.Scanner;
public class DivisorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);



System.out.println("Please enter a positive integer.");
	int num= input.nextInt();
	int i=0;
	int numDivisors=0;
	int largest=0;
	int j=0;
	
	for(j=1; j<=num; j++)
	{
		for(i=1; i<=num; i++)
		{
			if(num%j==0)
			{
				numDivisors++;
			}
			if(numDivisors>largest)
			{
			largest=numDivisors;	
			}
		 
		}
	}

	System.out.println(largest);
	}

}
