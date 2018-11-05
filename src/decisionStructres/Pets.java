package decisionStructres;
import java.util.Scanner;
public class Pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		int pets=0;
		int cars=0;
		System.out.println("How many pets");
				pets= input.nextInt();
		System.out.println("How many cars");
		cars= input.nextInt();
		
		System.out.println(pets<=5 || cars>3);
	}

}
