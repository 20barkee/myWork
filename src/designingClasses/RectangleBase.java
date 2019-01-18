package designingClasses;

public class RectangleBase {
	private double length;
	private double width;
	public RectangleBase()
	{  
	length = 10;
	width = 10;
	}
	public RectangleBase( double l, double w)
	{
	length = l;
	width = w;
	}
	public double perimeter()
	{
	return (2 * length + 2 * width);
	}
	public double area()
	{
	return (length * width);
	}
	}

