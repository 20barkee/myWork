package Strings;
import java.util.Scanner;
public class FirstProject {
	public static void main(String[]args) {
		
	
Scanner input=new Scanner(System.in);
System.out.println("Age?");
String age=input.next();

System.out.println("Full name?");

input.nextLine();
String name=input.nextLine();
//looks like it skips over name, but actualy has value for name and thats bad


System.out.println(age);

}
}
