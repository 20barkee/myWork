package review;

public class circle123 {
	private double radius;
	 
	 //constructor(s)
	    public circle123( )
	   {
	 radius = 10; 
	   }

	  public circle123(double xRadius)
	   {
		  if(xRadius>0) {
	 radius = xRadius;  
		  }
		  else 
			  xRadius=1;
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

