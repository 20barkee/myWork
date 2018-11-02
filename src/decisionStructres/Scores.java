package decisionStructres;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double average;
		System.out.println("Average of the test scores?");
		average = input.nextDouble();

		if (average >= 92.5) {
			System.out.println("Grade is A");
		}
		
		if(average>=92.5)
		{
			System.out.println("A");
		}
		else
		{
			if(average<92.5 && average>=84.5)
			{
			System.out.println("B");
			}
			if(average<84.5 && average>=77.5)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("f");
			}
		}
	}
}