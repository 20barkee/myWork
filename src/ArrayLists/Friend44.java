package ArrayLists;

import java.util.ArrayList;

import OOP.Friend;

public class Friend44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Friend> bob = new ArrayList<Friend>();

		bob.add(new Friend("BOb", 2));
		bob.add(0, new Friend("John Smith", 45));
		bob.add(0, new Friend("Steve Miller", 93));

		for (int i = 0; i < bob.size(); i++) {
			//need object variable to hold onto it temporarily
			Friend buddy= bob.get(i);
			System.out.println(buddy.getName());
		}
	}
}
