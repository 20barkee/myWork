package loops;
import java.util.Scanner;
public class LargestDivisor {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
//no number is divisable by more than half of itself
		int num;
		System.out.println("Please enter a positive integer.");
		num= input.nextInt();
		int counter=0;
		int largestDivisor=0;
		
		for(counter= 1; counter<num; counter++)
		{
			
			if(num%counter==0 && counter<num)
			{
				largestDivisor=counter;
			}
					
			}
	
		
		
		System.out.println("The largest divisor that divides evenly into " +num + " is " + largestDivisor);
		
	}
}



