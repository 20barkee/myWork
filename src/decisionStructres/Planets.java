package decisionStructres;
import java.util.Scanner;
public class Planets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

int planetChoice;
double weight; 

System.out.println("Please enter your weight");
weight= input.nextDouble();

System.out.println("Please chose a planet.");
System.out.println("1. Mercury");
System.out.println("2. Venus");
System.out.println("3. Mars");
System.out.println("4. Jupiter");
System.out.println("5. Saturn");

planetChoice= input.nextInt();

switch(planetChoice)
{
case 1: 
	weight= weight*.37; 
	System.out.println("Your weight is " + weight  + " lb");
	break;
	
case 2:
	weight= weight*.88;
	System.out.println("Your weight is " + weight  + " lb");
	break;
	
case 3: 
	weight= weight*.38;
	System.out.println("Your weight is " + weight + " lb");
	break;

case 4:
	weight= weight*2.64;
	System.out.println("Your weight is " + weight  + " lb");
	break;

case 5:
	weight= weight *1.15;
	System.out.println("Your weight is " + weight  + " lb");
	break;
	
default:
	System.out.println("You did not select a valid number. Please run the program again and try again.");
	 
	
}


	}
}
