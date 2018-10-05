package mathOperators;

import java.util.Scanner;

public class VolumeofShpere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double pi = Math.PI;
		final double FRACTION= 1.33333;
		double radius= -999.0;
		double volumeOfSphere= 0.0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the radius of the sphere?");
		radius= input.nextDouble();
		
		volumeOfSphere= radius * radius * radius * FRACTION * pi;
		
		System.out.println("The volume of the sphere is " + volumeOfSphere);
		
		
		input.close();
	}

}
