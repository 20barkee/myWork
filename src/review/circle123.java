package review;

public class circle123 {
	private double radius;
	 
	 //constructor(s)
	    public circle123( )
	   {
	 radius = -99; 
	   }

	  public circle123(double xRadius)
	   {
	 radius = xRadius;       
	    }

	//Accessor Methods
	   public double getRadius()
	   {
	        return radius;   
	    }

	public double circumference( ) 
	   {
	      return  2 * radius * Math.PI;
	   }

	  public double area( ) 
	   {
	      return Math.PI * radius * radius;
	    }

	//Mutator methods
	   public void setRadius(double xRadius)
	   {
	       radius = xRadius;
	   }
	}

