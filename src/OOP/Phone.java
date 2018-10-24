package OOP;

public class Phone {
	private long myNumber;
	private long speedDial;
	private long lastCall;
	private final int EMERGENCY= 911;
	private int numCalls;
	private double numMinutes;
	
	
	public Phone(){
		myNumber=1416410269;
		speedDial=1415670987;
		lastCall=1424567893;
//final so dosent have to be here EMERGENCY=991;
		numCalls=0;
		numMinutes=0;
	}
	 public Phone(long xMyNumber, long xSpeedDial, long xLastCall, int xNumCalls, double xNumMinutes ) {
		 myNumber= xMyNumber;
		 speedDial= xSpeedDial;
		 lastCall= xLastCall;
		 numCalls= xNumCalls;
		 numMinutes= xNumMinutes;
	 }
	 
	 //accessor methods
	 public long getMyNumber(){
		 return myNumber;
	 }
	 public long getSpeedDial() {
		 return speedDial;
	 }
	 public long getLastCall() {
		 return lastCall;
	 }
	 public int getEMERGENCY() {
		 return EMERGENCY;
	 }
	 public int getNumCalls() {
		 return numCalls;
	 }
	 public double getNumMinutes() {
		 return numMinutes;
	 }

	 
	 //mutator methods
	 public void setMyNumber(long newNumber) {
		 myNumber= newNumber;
	 }
	 public void setSpeedDial(long newSpeedDial) {
		 speedDial= newSpeedDial;
	 }
	 public void setLastCall(long newLastCall) {
		 lastCall= newLastCall;
	 }
	 public void setNumCalls(int newNumCalls) {
		 numCalls=newNumCalls;
	 }
	public void setNumMinutes(double newNumMinutes) {
		numMinutes= newNumMinutes;
	}
	public void call(long called, int time) {
		lastCall= called;
		numMinutes=numMinutes+ time;
		numCalls=numCalls+1;
	}
}
