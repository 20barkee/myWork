package decisionStructres;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double length=0;
	double width=0;
	double perimeter=0;
	double area=0;
	int option=0;
	
	System.out.println("Pick one option:");
	System.out.println("1. Area");
	System.out.println("2. Perimiter");
	option= input.nextInt();
	
	switch(option)
	{
	case 1:
		area= length*width;
		System.out.println("The area of the rectangle is "+ area);
		break;
	case 2:
		perimeter= length+length+width+width;
		System.out.println("The perimeter of the rectangle is " + perimeter);
		break;
	}
	}
}
