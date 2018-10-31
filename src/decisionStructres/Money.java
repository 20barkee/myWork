package decisionStructres;
import java.util.Scanner;
public class Money {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int age;
	double gpa;
	double total =0;
	System.out.println("How old are you?");
	age= input.nextInt();
	System.out.println("What is your gpa?");
	gpa= input.nextDouble();
	
	if(age+gpa > 20)
	{
	total = total + 250;
	}
	if (age+gpa > 20)
		total= total+30;
}
}
