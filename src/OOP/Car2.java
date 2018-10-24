package OOP;

public class Car2 {
	private double mpg;
	private double ftc;
	private double fuelInTank;
	private double odometer;
	
	public Car2(){
		mpg=20;
		ftc=20;
		fuelInTank=20;
		odometer=0;
	}
	public Car2(double newMpg, double newFtc, double newFuelInTank, double newOdometer) {
		mpg= newMpg;
		ftc= newFtc;
		fuelInTank= newFuelInTank;
		odometer= newOdometer;
	}
	
	public double getMpg() {
		return mpg;
	}
	public double getFtc() {
		return ftc;
	}
	public double getFuelInTank() {
		return fuelInTank;
	}
	public double getOdometer() {
		return odometer;
	}
	
	//mutator methods
	public void setMpg(double newMpg) {
		mpg=newMpg;
	}
	public void setFtc(double newFtc) {
		ftc=newFtc;
	}
	public void setFuelInTank(double newFuelInTank) {
		fuelInTank=newFuelInTank;
	}
	public void setOdometer(double newOdometer) {
		odometer=newOdometer;
	}
	
	//additional methods
	public void fillTank(double gallonsAdded) {
		fuelInTank= fuelInTank+ gallonsAdded;
	}
	public void driveCar(double milesDriven) {
		fuelInTank=fuelInTank-(milesDriven/mpg);
		odometer= odometer+milesDriven;
	}
}
