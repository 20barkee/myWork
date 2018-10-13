package OOP;

import java.util.Scanner;

public class Home {
	public Home(){
	}

	public void paintWall() {
		double height= -999;
		double length= -999;
		double time=-999;
		
		Scanner input= new Scanner(System.in);
		
		final double RATE= 1/200.0; //200 sq feet per hour
		final double conversion = 60.0/1; //minutes per hour
	
		System.out.println("What is the height of the wall");
		height= input.nextDouble();
		
		System.out.println("What is the length of the wall");
		length= input.nextDouble();
		time= (length*height)*RATE*conversion;
		
		System.out.println("It will take "+ time+ " to paint the wall.");
	
		
		//input.close();
	}
	
	Scanner input= new Scanner(System.in);
	
public void plantGarden(double length, int rows) {
	 
		final double RATE= 2.0/15.0 ;
		double time= (length*rows)*RATE;
		System.out.println("It will take " + time + " to plant the garden");	
}

public void fillPool(double radius, double height) {
	final double RATE= 300; //300 gallons an hour
	double volume= Math.PI * (radius*radius)* height;
	final double CONVERSION= 7.48052; // cublic feet to gallons
	volume= volume * CONVERSION;
	double time= volume/RATE;

	
	System.out.println("It will take " + Math.round(time) + " hours to fill the pool");
}


}

	
	

