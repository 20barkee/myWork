package decisionStructres;
import java.util.Scanner;
public class Honors {

	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		double gpa=0;
		int classGrade=0;
		
		System.out.println("What is your gpa?");
		gpa= input.nextDouble();
		System.out.println("What is your grade in numbers?");
		gpa= input.nextInt();
		if(gpa>= 3.5 && classGrade==12)		
		{ 
			System.out.println("You can graduate with honors.");
		}
			
		else
		{
			System.out.println("You cannot graduate with honors. Sorry.");
		}
		
	}
}
