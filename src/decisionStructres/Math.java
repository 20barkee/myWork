package decisionStructres;
import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		int num1;
		int num2;
		int result;
		//make sure that the number is greater than 0 (or at least num1)
		
		
		System.out.println("What is the first number?");
		num1= input.nextInt();
		System.out.println("What is the second number?");
		num2= input.nextInt();
		
		System.out.println("Please select the number coressponing with the option you would like to chose.");
		System.out.println("1. Find the sum.");
		System.out.println("2. Find the differenece.");
		System.out.println("3. Find the product.");
		System.out.println("4. Find the result of division (quotient).");
		System.out.println("5. Find the square root of the first number.");
		result= input.nextInt();
		
		switch(result)
		{
		case 1:
			result= num1+num2;
			System.out.println("The result is " + result);
			break;
		case 2:
			result= num1-num2;
			System.out.println("The result is " + result);
			break;
		case 3:
			result= num1*num2;
			System.out.println("The result is " + result);
			break;
		case 4: 
			result= num1/num2;
			System.out.println("The result is " + result);
			break;
		case 5:
			result= num1*num1;
			System.out.println("The result is " + result);
			break;
		default:
			System.out.println("You did not select a valid number. Please run the program again and try again.");
			break;
		}

	}
}


