package Inheritance;

public class Manager extends Employee{
private int managerLevel=200;

public Manager(String xName, double XPayRate) {
	super(xName, XPayRate);
}

double totalPay=0;
public double CalculatePay(double xHours) {
totalPay=super.CalculatePay(xHours)+(managerLevel/100);
return totalPay;
}
public Object clone() {
	return new Manager(super.getName(), super.getPay());
}
}

