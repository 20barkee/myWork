package loops;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("Enter positive int");
int num=input.nextInt();

int j=0;
int i=0;
for(j=1;j<=num; j++)
{


for(i=2;i<num;i++)
{
	if(num%i==0)
	{
		System.out.println(i +"");
		num=num/1;
		if(i==2)
		{
			i=1;
		}
	}
}
System.out.println(i);
	}

}
}
