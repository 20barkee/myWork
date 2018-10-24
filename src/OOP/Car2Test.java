package OOP;

import java.util.Scanner;
public class Car2Test {
public static void main(String []args) {
	Scanner input= new Scanner(System.in);
	
	
	System.out.println("This is for Moms Car:");
	System.out.println("What it the mpg?");
	double mpg= input.nextDouble();
	System.out.println("What is the fuel capacity?");
	double ftc= input.nextDouble();
	System.out.println("What is the fuel in the tank?");
	double fuelInTank= input.nextDouble();
	System.out.println("What is the odometer value?");
	double odometer= input.nextDouble();
	Car2 momsCar= new Car2(mpg, ftc, fuelInTank, odometer);
	momsCar.fillTank(40);
	System.out.println("Moms car Mpg:" + momsCar.getMpg());
	System.out.println("Fuel Capcity:" + momsCar.getFtc());
	System.out.println("Fuel In Tank:" + momsCar.getFuelInTank());
	System.out.println("Odometer:" + momsCar.getOdometer());
	
	System.out.println("This is for Dads Car:");
	System.out.println("What it the mpg?");
	mpg= input.nextDouble();
	System.out.println("What is the fuel capacity?");
	ftc= input.nextDouble();
	System.out.println("What is the fuel in the tank?");
	fuelInTank= input.nextDouble();
	System.out.println("What is the odometer value?");
	odometer= input.nextDouble();
	Car2 dadsCar= new Car2(mpg,ftc, fuelInTank, odometer);
	dadsCar.driveCar(23);
	System.out.println("After gas tank was filled, Dads car Mpg:" + dadsCar.getMpg());
	System.out.println("Fuel Capcity:" + dadsCar.getFtc());
	System.out.println("Fuel In Tank:" + dadsCar.getFuelInTank());
	System.out.println("Odometer:" + dadsCar.getOdometer());
	dadsCar.fillTank(50);
	
	System.out.println("After Car Was driven, Dads car Mpg:" + dadsCar.getMpg());
	System.out.println("Fuel Capcity:" + dadsCar.getFtc());
	System.out.println("Fuel In Tank:" + dadsCar.getFuelInTank());
	System.out.println("Odometer:" + dadsCar.getOdometer());
	
	
	System.out.println("This is for Kids Car");
	System.out.println("What it the mpg?");
	mpg= input.nextDouble();
	System.out.println("What is the fuel capacity?");
	ftc= input.nextDouble();
	System.out.println("What is the fuel in the tank?");
	fuelInTank= input.nextDouble();
	System.out.println("What is the odometer value?");
	odometer= input.nextDouble();
	Car2 kidsCar= new Car2(mpg,ftc, fuelInTank, odometer);
	kidsCar.fillTank(5);
	System.out.println("After Car Was driven, kids car Mpg:" + kidsCar.getMpg());
	System.out.println("Fuel Capcity:" + kidsCar.getFtc());
	System.out.println("Fuel In Tank:" + kidsCar.getFuelInTank());
	System.out.println("Odometer:" + kidsCar.getOdometer());
}
}
