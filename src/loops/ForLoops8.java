package loops;
import java.util.Scanner;
public class ForLoops8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);

		int counter;
		int sum=0;
		int num;

		for(counter=1; counter<=5; counter=counter+1)
		{
			System.out.println("Please enter a number");
			num= input.nextInt();
			
			if(num % 2 == 1)
			{
				System.out.println(num + " is odd.");
	
			}
			else
			{
				System.out.println(num +" is even.");
			}
			
		}	

	}
}
