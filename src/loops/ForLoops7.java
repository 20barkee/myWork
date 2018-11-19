package loops;
import java.util.Scanner;
public class ForLoops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		int counter;
		double sum=0;
		double fav;
		
		System.out.println("What is your favorite number?");
		fav=input.nextDouble();
		
		for(counter=1; counter<=50; counter=counter+1)
		{
			sum= sum+fav;
			
		}	
		System.out.println("The sum is " + sum);
	}
	}


