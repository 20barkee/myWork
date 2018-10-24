package OOP;

import java.util.Scanner;

public class Sandbox {
	public Sandbox() {
	}
	
		public void fillSandbox1() {
			double length= -999;
			double width=-999;
			double depth=-999;
			double area= -999;
			double sandPerHour= -999;
			double time=-999;
			double volume = -999;

			Scanner input= new Scanner(System.in);
			
			System.out.println("What is the length of the sandbox?");
			length= input.nextDouble();
			
			System.out.println("What is the depth of the sandbox?");
			depth= input.nextDouble();
			
			System.out.println("What is the width of the sandbox?");
			width= input.nextDouble();
		
			volume= width*length*depth;
			
			System.out.println("How much sand (in cublic feet) can be transported per hour?");
			sandPerHour= input.nextDouble();
			
			time= volume/sandPerHour;
			System.out.println("It will take " + time +" hours to fill the sandbox with sand");
			
		}
		
		public void fillSandbox2(double width, double length, double depth, double sandPerHour) {
			double time = (length*width*depth)/sandPerHour;
			System.out.println("It will take " + time +" hours to fill the sandbox with sand");
		}
		
		public double fillSandbox3(double width, double length, double depth, double sandPerHour) {
			double time = (length*width*depth)/sandPerHour;
			return time;
		}
		
		
}
