package loops;

import java.util.Scanner;


public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
			
			System.out.println("Input a test score. (9999 to terminate)");
			double score = input.nextDouble();
			double low = score;
			double high = score;
			do
			{
			while (score != 9999) {
				if (score < low) {
					low = score;
				}
				if (score > high) {
					high = score;
				}
				if (score >= 70) {
					
			
				}
				System.out.println("Input a test score. (9999 to terminate)");
				score = input.nextDouble();
			}
			}
			while(score!=9999);
			double range= high-low;
			System.out.println("Largest Test Score: " + high);
			System.out.println("Smallest Test Score: " + low);
			System.out.println("Range of Test Scores: " + range);
		
			}
	}



//will have to ask for some kind of a number
//determine if biggest or smallest and then remeber it
//do this over and over
//then output difference of biggest-smallest
//should have stratagy before typing