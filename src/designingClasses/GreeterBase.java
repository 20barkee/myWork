package designingClasses;

public class GreeterBase {
	private static int idNum = 1;
	private String name;
	private int myID;

	public GreeterBase() {
		myID = idNum;
		idNum++;
		name = "Bob Smith";
	}

	public GreeterBase(String myName) {
		name = myName;
		myID = idNum;
		idNum++;
	}

	public String displayInfo() {
		return "Greeter:  name:" + name + "  IDNum:" + myID;

	}
}
