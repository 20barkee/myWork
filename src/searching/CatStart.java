package searching;

public class CatStart implements Comparable<CatStart> {
	
	private double age;
	private double sleep;

	public CatStart()
	{
	age = 1;
	sleep = 12;
	}

	public CatStart(int xAge, int xSleep)
	{ 
	age =xAge;
	sleep =xSleep; 
	}

	public double getAge()
	{
	return age;
	}

	public double getSleep()
	{
	return sleep;
	}

	public void setAge(int xAge)
	{
	age = xAge;
	}

	public void setSleep(int xSleep)
	{
	sleep = xSleep;
	}

	public void birthday()
	{
	age++;
	}

	public void sleepMore()
	{
	sleep++;
	}

	public void sleepless()
	{
	sleep--;
	}
	
	public int compareTo(CatStart temp)
	{
		if(Math.abs(age-temp.getAge())<.0001)
		{
			return 0;
		}
		
		if(age< temp.getAge())
			return -1;
		
		return 1;
	}
}
