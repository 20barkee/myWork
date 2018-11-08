package loops;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int num;
System.out.println("Please enter an integer. (Enter '-1' to escape)");
num= input.nextInt();

while(num != -1)
{
	int squareNum=num*num;
	System.out.println("The cube of " +num+" is "+squareNum);
	System.out.println("Please enter an integer. (enter -1 to escape)");
	num= input.nextInt();
}
System.out.println("You have chosen to quit. Thank you for visiting.");
	}

}
