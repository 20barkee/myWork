package loops;
import java.util.Scanner;
public class ExponentsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);

double num;
System.out.println("Please enter an integer. OR Enter 9999 to quit.");
num=input.nextInt();

do
{
	double exponent= Math.pow(num,5);
	System.out.println(exponent);
	System.out.println("Please enter an integer. OR Enter 9999 to quit.");
	num=input.nextInt();

}
while !(Math.abs(num-9999) <0.00001);
	}

}
