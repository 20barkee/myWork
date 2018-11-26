package loops;
import java.util.Scanner;
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int limit;
		System.out.println("How high would you like to count to?");
		limit= input.nextInt();
		
		int start=0; //1.get
		while(start<=limit) //2.test
		{
			System.out.println(start); //3.use
			start+=2;
		}

	}

}
