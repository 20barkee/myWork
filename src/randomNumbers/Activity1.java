package randomNumbers;
import java.util.Random;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Random generator=new Random(42);
		Random generator2=new Random(42);
		int min=1;
		int max=2;
		int heads=0;
		int tails=0;
		int randomNum=0;
for(int i=1; i==100000; i++)
{
	randomNum=min+generator.nextInt(max-min+1);
	if(randomNum==0)
	{
		heads++;
	}
}
System.out.println(heads);
System.out.println("tails="+(100000-heads));

	}

}
