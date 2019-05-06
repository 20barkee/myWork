package springBreakReview;

import java.util.ArrayList;
import java.util.Random;

public class Employee {
	private String name;
	private double hourlyRate;
	private ArrayList<Double> hoursWorked = new ArrayList<Double>(52);
	private static double employeeClassNum = 0;
	private double employeeNum;

	Random generator = new Random();
	int min = 0;
	int max = 40;
	double result = min + generator.nextInt(max - min + 1);

	public Employee() {
		name = "John Smith";
		hourlyRate = 10;

		for (int j = 0; j < 52; j++) {
			hoursWorked.add(result);
		}

		employeeNum = employeeClassNum;
		employeeClassNum++;

	}

	public void modifyRate(double value) {
		hourlyRate += value;
	}

	public double calcPay(int weekNum) {
		double hours=0;
		if (hoursWorked.get(weekNum - 1) <= 40) {
			hours = hoursWorked.get(weekNum - 1);

		}
		return hours * hourlyRate;
	}
}
