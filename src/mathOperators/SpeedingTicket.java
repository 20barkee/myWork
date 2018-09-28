/**
 * 
 */
package mathOperators;

import java.util.Scanner;

/**
 * @author 20barkee
 *
 */
public class SpeedingTicket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int speedLimit= -999;
		int drivingSpeed= -999;
		
		Scanner input =new Scanner(System.in);
		System.out.print("What is the speed limit?");
		speedLimit= input.nextInt();
		
		System.out.print("What speed was the person driving?");
		drivingSpeed= input.nextInt();
		
		int fee= drivingSpeed - speedLimit;
		
		int fine = (fee - 1) * 40 + 55;
		
		System.out.println("The fine is: " + fine);
		input.close();

	}

}
