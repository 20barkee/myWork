package arrays;
import java.util.Scanner;
public class MallSantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int numSantas=2;
		String name= "bob";
		int age=7;
		boolean criminal=false;
		MallSanta[] bob= new MallSanta[numSantas];
		
		//String[] names= new String[numSantas];
		
		for(int i=0; i<numSantas;i++) {
			
		System.out.println("Please enter the santa name");
		name=input.nextLine();
		System.out.println("Please enter the age");
		age=input.nextInt();
		System.out.println("criminal?");
		criminal=input.nextBoolean();

	
		//clear the buffer
		 bob[i]= new MallSanta(name, age, criminal);
			input.nextLine();
		}
		for(int j=0; j<numSantas; j++) {
			if(bob[j].employable()==true) {
				System.out.println("The employable santas include: " + bob[j].getName());
			}
			
		}
		
		
	}

}
