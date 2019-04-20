package Inheritance;

public class Worker extends Employee{

	private int yearsWorked;
	public Worker(String xName, double XPayRate) {
		super(xName, XPayRate);
	}
	
	double totalPay=0;
	public double CalculatePay(double xHours) {
	if(yearsWorked>=10) {
		totalPay+=super.CalculatePay(xHours) + (totalPay*.20);
	}
	else
		totalPay+=super.CalculatePay(xHours);
		return totalPay;
	}
	public String toString() {
		return "Worker Object= Name: " + super.getName() + "Pay Rate: "+ super.getPay() + "Years of experience: " + yearsWorked;
	}

	

}
