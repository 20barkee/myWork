package Strings;

public class BestFreinds {

	private String name1;
	private String name2;
	private String name3;
	private boolean worked;
	private int letters;

	public BestFreinds() {
		name1 = "Bob Smith";
		name2 = "Judy Jones";
		name3 = "Billy Miller";
		worked = false;
	}

	public boolean changeFriend(String newFriend, int rank) {

	if(newFriend.contains(" ")&&rank>0&&rank<4) {
		worked=true;
	}
	return worked;
	}
	
	
	public String getFriend1() {
		return name1;
	}

	public int getLastLength() {
		int space = name3.indexOf(" ");
		String last=name3.substring(space+1);
		return last.length();
		
	}

}
