package loops;



public class CircleMain {
	private double radius;
	public CircleMain()
	{
		radius=-999;
	}
	public CircleMain(double newRadius)
	{
		radius=newRadius;
	}

	public double getRadius()
	{
		return radius;
	}
	public double circumference()
	{
		double circumference= (2*radius)*Math.PI;
		return circumference;
	}
	public double area()
	{
		return Math.PI* radius*radius;
	}
		public void setRadius(double xRadius)
		{ 
			radius=xRadius;
		}
}
