package loops;
import java.util.Scanner;
public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

int user=0;
int highest=0;
int lowest=0;
	
	while (user !=999)
	{
		System.out.println("Please enter in your test score or enter 999 to see the highest and lowest scores.");
		user=input.nextInt();
		
		if(user>highest)
		{
			highest= user;
		}
		
		if(user<lowest)
		{
			lowest= user;
		}
	}
	
	System.out.println("The highest test score is "+ highest);
	System.out.println("The lowest test score is " + lowest);
			
		}

	}
//fix that the lowest will be zero always but it has to be initized to something


