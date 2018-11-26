package decisionStructres;
import java.util.Scanner;
public class NestedLoopTest {
	public static void main(String[]args) {
		
	
Scanner input=new Scanner(System.in);
 
System.out.println("Please enter in an integer");
int num= input.nextInt();
int total=0;

for(int i=1; i<=num; i++)
{
	if(i%2==0)
	{
		num=num+total;
	}
	//num=0;
}
System.out.println(total);
	}
}
