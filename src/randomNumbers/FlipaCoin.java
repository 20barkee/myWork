package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class FlipaCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random generator=new Random();
		int min=1;
		int max=2;
		int heads=0;
		int tails=0;
		int randomNum=0;
		double largest=0;
		double smallest=0;
		for(int j=0; j<1000; j++) {
for(int i=0; i<100000; i++)
{
	randomNum=min+generator.nextInt(max-min+1);
	if(randomNum==0)
	{
		heads++;
	}
}
double headsPer=100.0*(heads/100.0);
//makes the number a percent

	if(headsPer>largest) {
		largest=heads;
	}
	if(headsPer<smallest) {
		smallest=heads;
	}
	heads=0;
		}
System.out.println(largest);
System.out.println(smallest);


}
	}


