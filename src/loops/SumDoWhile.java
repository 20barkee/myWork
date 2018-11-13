package loops;
import java.util.Scanner;
public class SumDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

int num1;
int num2;
int sum;
System.out.println("Please enter the value for the first number.");
num1= input.nextInt();
System.out.println("Please enter the value for the second number.");
num2= input.nextInt();
do
{
	
sum= num1+num2;	

System.out.println("The sum is "+sum);
System.out.println("Please enter the value for the first number.");
num1= input.nextInt();
System.out.println("Please enter the value for the second number.");
num2= input.nextInt();

}
while(num1!=999);
System.out.println("The end");
	}

}
