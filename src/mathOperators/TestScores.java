package mathOperators;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double test1= -999.0;
		double test2= -999.0;
		double test3= -999.0;
		double average= 0.0;

	Scanner input= new Scanner(System.in);
	
	System.out.println("What is the first test score?");
	test1= input.nextDouble();
	
	System.out.println("What is the second test score?");
	test2= input.nextDouble();
	
	System.out.println("What is the third test score?");
	test3= input.nextDouble();
	
	average= (test1 + test2+ test3)/3;
	
	System.out.println("First Test Score: " + test1 + "%");
	System.out.println("Second Test Score: " + test2 + "%");
	System.out.println("Third Test Score: " + test3 + "%");
	
	
	System.out.println("The Average of the three test scores are: " + average + "%");
	
	input.close();	
	
	}

}
