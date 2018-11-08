package loops;
import java.util.Scanner;
public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	
	int num=0;

	
	while (num!= 999)
	{
		System.out.println("Please enter a four digit int. OR enter 999 to quit.");
		num=input.nextInt();
		System.out.println("The rounded number is " + Math.round(num/10));
	}
	
	System.out.println("Thank you for using the progam. Come again soon.");
	}

}
