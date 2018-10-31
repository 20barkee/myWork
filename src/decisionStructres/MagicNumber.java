package decisionStructres;
import java.util.Scanner;
public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	    final int  magicNumber= 5555;
	    int guess=0;
	    
	    System.out.println("What do you think the magic number is?");
	    guess= input.nextInt();
	    
	    if(guess == magicNumber)
	    {
	    	System.out.println("Congrats youre a winner (but on the inside you're still a loser).");
	
	    }
	    if (guess != magicNumber)
	    {
	    	System.out.println("You suck loser.");
	    }

	}

}
