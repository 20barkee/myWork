package OOP;

public class Greeter2 {
//fields
private int age;

//constructors
public Greeter2() {
	age=-999;
}
//methods
public int getAge() { //getter method: returning int getAge 
	return age;
	//getters are acessor methods that reports back its value to main method or wherever it came from
}
public void setAge(int xAge) { //setter void return type so pass it a parameter
	age= xAge; //x is the local variable inside of there 
	//mutoator method that assigns fields a new value
}
}
//now every method inside of that oject can reference the field
// we have the getter because of the keyword private up above. This will retun a...
//... copy of whatever the greeters age is at that time