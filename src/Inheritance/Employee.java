package Inheritance;

public class Employee {
	private String name;
	private double payRate;
	
	public Employee(String xName, double XPayRate) {
		name=xName;
		payRate=XPayRate;
	}
	double numHours=0;
	double totalPay=0;
	public double CalculatePay(double xHours) {
	 numHours+=xHours;
	totalPay= numHours*payRate;
	return totalPay;
	}
	public double getPay() {
		return payRate;
	}
	public String getName() {
		return name;
	}
	public boolean equals(Object otherObject) {
		return(this.toString().equals(otherObject.toString()));
	}

}
