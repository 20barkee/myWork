package randomNumbers;

import java.util.Random;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator=new Random();
		int min=26;
		int max=43;
		int height=0;
		int randomNum=0;
for(int i=0; i<248; i++)
{
	randomNum=min+generator.nextInt(max-min+1);
	if(randomNum>36)
	{
		height++;
	}
}
System.out.println("There are " + height+ "Russian children with a height of greater than 3 feet");
	}

}
