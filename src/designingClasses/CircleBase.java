package designingClasses;

public class CircleBase {
	
		private double radius;
		public CircleBase()
		{  
		radius = 5;
		}
		public CircleBase( double r)
		{
		radius = r;
		}
		public double perimeter()
		{
		return (2 * radius * Math.PI);
		}
		public double area()
		{
		return (Math.PI * radius * radius);
		}
		}
