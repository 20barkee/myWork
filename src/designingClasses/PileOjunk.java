package designingClasses;

public class PileOjunk {
private static int id=0;

private int myId;
private int number;
private String name;
public PileOjunk() {
	myId=id;
	id+=2;
	
	number=(int)(Math.random()*91)+10;
}
public static int sum(int one, int two) {
	return one +two;
	
}
	public void setNumber(int xnumber) {
		number=xnumber;
	}
	
	public String displayInfo() {
	return "name:" +name +"IdNum:" +myId;
}
}