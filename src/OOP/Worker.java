package OOP;

public class Worker {
	// instance fields
	private int hours;
	private double hourlyPay;

	// constructor
	public Worker() {
		hours = -999;
		hourlyPay = -999;
	}

	// alternate constructor
	public Worker(int newHours, double newHourlyPay) {
		hours = newHours;
		hourlyPay = newHourlyPay;
	}

	// acessor methods
	public int getHours() {
		return hours;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public double payCheck() {
		double payCheck = hours * hourlyPay;
		return payCheck;
	}

	// mutator methods
	public void raise(double number) {
		hourlyPay = hourlyPay + number;
	}
}
