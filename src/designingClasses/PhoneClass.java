package designingClasses;

public class PhoneClass {

	private static int companyProductNumber=0;
	private int productNumber;
	private long myNumber;
	private static int maxMinutes=1000;
	private int minutesUsed;
	
	public PhoneClass(long xPhoneNumber, int xMinutesUsed) {
		myNumber= xPhoneNumber;
		minutesUsed= xMinutesUsed;
	
		
	}
}
