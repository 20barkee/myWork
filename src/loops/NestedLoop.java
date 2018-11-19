package loops;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		int choice=1;
		int sum=0;
	do
	{
		System.out.println("Enter postive int.");
		choice= input.nextInt();
		for(int i=2; i<=choice; i=i+2)
		{
			if(choice%i==0)
			{
				sum=sum+i;
			}
			System.out.println("The number of even divisors is " +sum);
			System.out.println("Press 1 to continue or 0 to quit");
			choice=input.nextInt();
		}
	}
	while(choice==1);
	}

}
