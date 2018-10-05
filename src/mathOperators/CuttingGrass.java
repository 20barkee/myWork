package mathOperators;
 
import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width=-999.0;
		double lenght= -999.0;
		double radius= -999.0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("What is the width of the lawn in feet?");
		width=input.nextDouble();
		System.out.println("What is the length of the lawn in feet?");
		lenght=input.nextDouble();
		System.out.println("What is the radius of the fountain in feet?");
		radius=input.nextDouble();

		double circleArea= (radius*radius)* Math.PI;
		double yardArea= (width*lenght)- circleArea;
		
		double yardRounded=Math.round(yardArea*10)/10;
		
		double money = (yardArea/100)*1.25;
		double moneyRounded= Math.round(money*10)/10;
		
		
		System.out.println("The area of the yard is " + yardRounded);
		System.out.println("$" + moneyRounded + " is owed to the person cutting the lawn.");
		
		input.close();

	}

}
