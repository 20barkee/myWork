package loops;
import java.util.Scanner;
public class NestedLoops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

	
		int j=0;
		int possibilities;
		int numDivisors=0;
		int largest=0;
		int k;
		int num=1;
		//watch video on this and fix it
		for(k=1; k<=1000; k++)
		{
		numDivisors=0;
		for(j=1;j>=k;j++)
		{
			if(k%k==0)
			{
				numDivisors ++;
			}
		}
		if(numDivisors>largest)
		{
		largest=numDivisors;
			num=k; //reset
			numDivisors=0;
		}
		}
		System.out.println(largest);
	}

}
