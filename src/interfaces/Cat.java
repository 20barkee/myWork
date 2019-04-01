package interfaces;

public class Cat implements Animal{

	private String name= "CatCat";
	private int age= 600;
	private boolean friendly= false;
	
	public void act() {
		age+=9;
		if(friendly==true) {
			friendly=false;
		}
		if(friendly==false) {
			friendly=true;
		}
	}
	
	public String toString() {
		return "Cat Name: " + name + " Cat age: " + age+ " Is cat friendly: "+ friendly;
	}
	public boolean returnFriendly() {
		return friendly;
	}
}
