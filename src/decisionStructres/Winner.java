package decisionStructres;
import java.util.Scanner;
public class Winner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		double money=0;
	
		
		System.out.println("How much money did you recive?");
		money= input.nextDouble();
		
		//do not comapre doubles for equality
		if(Math.abs(money- Math.sqrt(84.3)) < .01)
		{
			System.out.println("Congrats you have won more money.");
		}
		else 
		{
			System.out.println("You have won a suckish prize.");
		}
	}

}
