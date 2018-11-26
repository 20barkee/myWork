package loops;
import java.util.Scanner;
public class CircleDoWhile {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	
	CircleMain bob= new CircleMain();
	CircleMain fred=new CircleMain();
	CircleMain joe= new CircleMain();
	
	boolean con=true;
	double largest=0;
	
	do 
	{
		System.out.println("Please input a radius for the first triangle.");
		bob.setRadius(input.nextDouble());
		System.out.println("Please enter a radius for the second triangle.");
		fred.setRadius(input.nextDouble());
		System.out.println("Please enter a radius for the third triangle.");
		joe.setRadius(input.nextDouble());
		
		if(bob.circumference() > fred.circumference())
		{
			largest=bob.circumference();
		}
		if(fred.circumference() > bob.circumference())
		{
			largest=bob.circumference();
		}
		if(joe.circumference() >bob.circumference())
		{
			largest=joe.circumference();
		}
	
		System.out.println("The largest circumference is " + largest);
		System.out.println("Would you like to run the program agian? Please input true or false.");
		con=input.nextBoolean();
	}
 	while(con==true);
	System.out.println("Thank you for using the program. Please come agian soon");
	
}
}
