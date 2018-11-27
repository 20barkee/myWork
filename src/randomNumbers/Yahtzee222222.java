package randomNumbers;
import java.util.Random;
public class Yahtzee222222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		
		int min=1;
		int max=6;
		int rolls=0;
		int yahtzee=0;
		int randomNum=0;
while(yahtzee<100)
{
	randomNum=min+generator.nextInt(max-min+1);
	int randomNum2=min+generator.nextInt(max-min+1);
	int randomNum3=min+generator.nextInt(max-min+1);
	int randomNum4=min+generator.nextInt(max-min+1);
	int randomNum5=min+generator.nextInt(max-min+1);
	rolls++;
	if(randomNum==randomNum2 &&randomNum3==randomNum4&&randomNum5==randomNum&&randomNum5==randomNum3)
	{
		yahtzee++;
	}
	
	
	
}
System.out.println("It took "+ rolls +" tries to get 100 yahtzees");

	}

}
