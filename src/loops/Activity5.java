package loops;
import java.util.Scanner;
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int num;

System.out.println("Please enter a number. (9999 to quit)");
num=input.nextInt();
while(num!=9999)
{
num=num*2;
System.out.println(num);
System.out.println("Please enter a number. (9999 to quit)");
num=input.nextInt();
}
	}

}
