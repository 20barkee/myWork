package loops;
import java.util.Scanner;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

int counter;
int fact=1;
int number; 
System.out.println("Please enter a number to find its factorials");
number=input.nextInt();
for(counter=1;counter<=number;counter++)
{
	fact=fact*counter;
}
System.out.println("The factoial of "+number +" is " + fact);
	}

}
