package mathOperators;

import java.util.Scanner;

public class TakeaTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distance= -999.0;
		double MPG= -999.0;
		double money = -999.0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What (in miles) is the distance of the trip?");
		distance = input.nextDouble();
		
		System.out.print("What is the fuel economy of the car (MPG)?");
		MPG= input.nextDouble();
		
		System.out.println("How much money was spent on gas during the trip?");
		money= input.nextDouble();
		
		double avarageCostofGas1= (distance / MPG);
		double avarageCostofGas2= money / avarageCostofGas1;
		
		System.out.println("The total distance travled was: " + distance);
		
		System.out.println("The avarage cost per gallon of the trip is: " + avarageCostofGas2);
		
		double usedGas= distance / MPG;
		
		System.out.println("The gallons of gas used on this trip were: " + usedGas);
		
		
		input.close();

	}

}
