package interfaces;

public class Trout implements Fish {
private double length=0;
private int age=7;
private double numScales=0;

	public Trout(double xLength, int xAge, double xNumScales) {
		length=xLength;
		age= xAge;
		numScales=xNumScales;
	}
	
	public double getLength() {
		return length;
	}
	public String toString() {
		return "Trout length: " + length +" Trout age: " + age + " number of trout scales " + numScales;
	}
	
	public int getAge() {
		return age;
	}
	public double getNumScales() {
		return numScales;
	}
}

