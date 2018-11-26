package loops;
import java.util.Scanner;
public class DoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
			
	
	int num;
	System.out.println("Please enter an integer or 9999 to quit.");
	num= input.nextInt();
		do
		{
			System.out.println(num*17);
			System.out.println("Please enter an integer");
			num= input.nextInt();
		}
	while(num!=9999);
	}

}
