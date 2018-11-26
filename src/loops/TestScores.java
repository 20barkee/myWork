package loops;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	
	double testScores=0;
	int numTests=0;
	double sum=0;
	double average=0;
	double oldTestScores=0;
	
	System.out.println("Please enter your test score.");
	System.out.println("Or enter 9999 to see the sum and average of those test scores.");
testScores=input.nextDouble();
	while(testScores !=9999)
	{
		sum+=testScores;
		System.out.println("Please enter your test score.");
		System.out.println("Or enter 9999 to see the sum and average of those test scores.");
	testScores=input.nextDouble();
	

	numTests= numTests+1;
	
	}
	average= sum/numTests;
	System.out.println("The sum of the scores is " +sum);
	System.out.println("The average of the scores is "+average);
	}
	}

	
	
	

