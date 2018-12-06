package Strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		String text="My name is Buzz Lightyear!";
				
				for (int i=1;i<text.length(); i++)
				{
					System.out.println(text.substring(0,i));
				}
	}

}
