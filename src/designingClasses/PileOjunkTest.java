package designingClasses;
import java.util.ArrayList;
import java.util.Scanner;
public class PileOjunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	
	ArrayList<PileOjunk> people =new ArrayList<PileOjunk>();
	System.out.println("How many pile of junk objects do you want?");
	int num=input.nextInt();
	
	for(int i=0; i<num;i++) {
		System.out.println(people.add(new PileOjunk()));
		
	}
	
	for(PileOjunk temp: people) {
		System.out.println(temp.displayInfo());
	}
	System.out.println("Enter two values");
	int num1=input.nextInt();
	int num2=input.nextInt();
	
	PileOjunk trash=new PileOjunk();
	System.out.println("The sum is : " + trash.sum(num1, num2));

	
	}

}
