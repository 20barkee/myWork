package randomNumbers;
import java.util.Random;
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator=new Random(7);
		int min=1;
		int max=13;
		int multiple=0;
	
		int randomNum=0;
for(int i=0; i<87; i++)
{
	randomNum=min+generator.nextInt(max-min+1);
	if(randomNum%3==0)
	{
		multiple++;
	}
}
System.out.println("A multiple of three was rolled " + multiple+ " times");

	}
	

}
