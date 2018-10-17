package OOP;

public class Employee {
private double wage; 
private int experience;


public Employee() {
	wage=-999;
}

public double getWage() { //public versus private are the acess specifiers?
	return wage;


}

public int getExperience() {
	return experience;


}

public void setWage(double xWage) {
	wage=xWage;
	wage=wage*1.1;
}
	public void setExperience(int xExperience) {
		experience= xExperience;	
}

}
//private restricts access from outside of the object
