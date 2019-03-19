package searching;



	public class DadSchool implements Comparable<DadSchool>{
	
		private double hours;
		private double rate;

		//constructor(s)
		public DadSchool(){
		hours = 40;
		rate = 3.50;
		}

		public DadSchool(double newHours, double newRate){
		hours = newHours;
		rate = newRate;
		}

		public double getHours(){
			return hours;
		}

		public void setHours(int xHours){
			hours = xHours;
		}

		public double getRate(){
			return rate;
		}

		public void setRate(double xRate){
			rate = xRate;
		}

		public double payCheck(){
			return hours * rate;
		}

		public void raise(double amount){
				rate = rate + amount;
		}
		public int compareTo(DadSchool temp)
		{
			if(Math.abs(rate-temp.getRate())<.001)
			{
				return 0;
			}
			
			if(rate< temp.getRate())
				return -1;
			
			return 1;
		}
	}

