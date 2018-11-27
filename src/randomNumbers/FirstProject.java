package randomNumbers;
import java.util.Random;
public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator=new Random();
		int min=0;
		int max=100;
		
		int randomNum=min+generator.nextInt(max-min+1);
System.out.println(randomNum);
	}

}
