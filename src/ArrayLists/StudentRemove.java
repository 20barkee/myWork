package ArrayLists;

import java.util.ArrayList;

import OOP.Friend;


public class StudentRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Friend>bob= new ArrayList<Friend>();
		bob.add(new Friend("bob",0));
		bob.add("Bob");
		bob.add("BoBby");
		
	Friend temp=	bob.remove(0);
		bob.set(bob.size()-1, temp);
		
	Friend temp2=bob.remove(bob.size()-1);
	bob.set(0, temp2);
		
	for(int j=0;j<bob.size();j++) {
		Friend buddy= bob.get(j);
		System.out.println(buddy);
	}
}
}
