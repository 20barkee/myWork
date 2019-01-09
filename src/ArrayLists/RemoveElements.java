package ArrayLists;
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();

		names.add("Bob Smith");
		names.add(1,"Jane Miller");
		names.add(0, "Billy Jones");
		
		System.out.println("What is your name?");
		String userName= input.nextLine();
		names.add(3,userName);
	
		
		names.remove(1);
		
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}

		

	}

}
