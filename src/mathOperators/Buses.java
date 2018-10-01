package mathOperators;
import java.util.Scanner;

public class Buses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int people= -999;
		final int BUSESPEOPLE= 35;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("How many people are there?");
		people = input.nextInt();
		
		int leftOvers = people % BUSESPEOPLE;
		int buses = people/ BUSESPEOPLE;
		
		System.out.println("There are " + people + " people in the group.");
		System.out.println("So, " + buses + "  buses will need to be ordered.");
		System.out.println("There will be " + leftOvers + " people left over.");
		
		input.close();

	}

}
