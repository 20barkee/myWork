package Strings;
import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen=new Random();
Scanner input=new Scanner(System.in);

int min=1;
int max=10;

System.out.println("Enter a five letter word");
String word1=input.nextLine();
System.out.println("Enter a six letter word");
String word2=input.nextLine();
System.out.println("Enter a seven letter word");
String word3=input.nextLine();

System.out.println("New Password is...");
System.out.println(word1.substring(0, 1));
System.out.println(word2.substring(5, 6));
System.out.println(word3.substring(3, 4));
System.out.println(gen.nextInt(min-max+1));
System.out.println(gen.nextInt(min-max+1));
System.out.println(gen.nextInt(min-max+1));
	}

}
