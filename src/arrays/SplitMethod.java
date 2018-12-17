package arrays;
import java.util.Scanner;
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("Enter a sentence");
String sentence= input.nextLine() + " ";
String[] words=sentence.split(" ");
System.out.println("Enter a keyword");
String keyWord=input.nextLine();


int numTimes=0;
for(int j=0; j<words.length; j++ )
{
	if(words[j].contains(keyWord))
	{
		numTimes ++;
	}
}
System.out.println(keyWord + " appeared in the sentence "+ numTimes + " times.");
	}


}
