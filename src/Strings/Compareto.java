package Strings;
import java.util.Scanner;
public class Compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

System.out.println("Please enter a name");
String name=input.nextLine();

System.out.println("Another name");
String name2=input.nextLine();


//go to the name string object but bringing along reference to name2

System.out.println(name.compareTo(name2));

//if equal it will return 0
//if negative, name is less than name2
//if positive, name is greater than name2

	}

}
