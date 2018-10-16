package OOP;
 import java.util.Scanner;
public class SandboxTest {
	public static void main(String [] args) {
		
		Scanner input= new Scanner(System.in);
	
	Sandbox test= new Sandbox();
	test.fillSandbox1();
	// for 2 all the inut gets shifted to the main method
	//basically just leave the sop line for end result
	// for 3 method is only doing calculation

	double length= -999;
	double width=-999;
	double depth=-999;
	double area= -999;
	double sandPerHour= -999;
	System.out.println("What is the length of the sandbox?");
	length= input.nextDouble();
	
	System.out.println("What is the depth of the sandbox?");
	depth= input.nextDouble();
	
	System.out.println("What is the width of the sandbox?");
	width= input.nextDouble();

	System.out.println("How much sand (in cublic feet) can be transported per hour?");
	sandPerHour= input.nextDouble();
	
	test.fillSandbox2(width, length, depth, sandPerHour);
	
	

	System.out.println("What is the length of the sandbox?");
	length= input.nextDouble();
	
	System.out.println("What is the depth of the sandbox?");
	depth= input.nextDouble();
	
	System.out.println("What is the width of the sandbox?");
	width= input.nextDouble();

	System.out.println("How much sand (in cublic feet) can be transported per hour?");
	sandPerHour= input.nextDouble();
	
	double timeReturned= test.fillSandbox3(length, width, depth, sandPerHour);
	System.out.println("It will take " + timeReturned + " hours to fill the sandbox");
	
}
	
}