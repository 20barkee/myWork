package mathOperators;
import java.util.Scanner;

public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width= -999.0;
		double length=-999.0;
		double mowerWidth=-999.0;
		int mph= -999;
		final int PAY= 12;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("What is the width of the lawn?");
		width=input.nextDouble();
		
		System.out.println("What is the length of the lawn?");
		length= input.nextDouble();
		
		System.out.println("What is the width of the lawn mower in inches?");
		mowerWidth=input.nextDouble();
		
		System.out.println("How many miles per hour is the lawn mower going?");
		mph=input.nextInt();
		
		
		double mowerWidthFeet= mowerWidth/12;
		double area= width*length;
		double grassCutPerHour= mowerWidth/mph;
		double howLong= area/grassCutPerHour;
		
		double cost= 
		
		System.out.println("It will take "+ howLong +" hours to cut the lawn.");
		System.out.println("The person will be owed $" + money + "." );
		input.close();
		

	}

}

