package loops;
import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

//****okay so im pretty sure this is all right but maybe double check with someone just to be sure****

int numStudents;
double testScore;
double classAverage;
int counter=0;
double sum=0;

System.out.println("How many students took the test?");
numStudents=input.nextInt();

for(counter=1; counter<= numStudents; counter++)
{
	System.out.println("Test Score?");
	testScore=input.nextDouble();
	
	sum=sum+testScore;
	
}
classAverage=sum/numStudents;
System.out.println("The class average for this test was "+classAverage);
	}

}
