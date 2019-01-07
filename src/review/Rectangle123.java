package review;

public class Rectangle123 {
	private double length;
	private double width;
	 
	 //constructor(s)
	    public Rectangle123(int randomNum, int randomNum2) {
		// TODO Auto-generated constructor stub
	}

		public Rectangle123( )
	   {
	 length = 10;
	width = 5;
	   }

	   public Rectangle123(double xLength, double xWidth)
	   {
		   if(xLength>0&& xWidth>0) {
	 length = xLength;
	width = xWidth;
		   }
		   else
			   xLength=1;
		   xWidth=2;
	    }

	//Accessor Methods
	   public double getLength(){
	        return length;   
	    }

	public double getWidth(){
	return width;
	}

	public double perimeter( ){
	      return  2 * length + 2 * width;
	   }

	  public double area( ) 
	   {
	      return length * width;
	    }

	//Mutator methods
	   public void setLength(double xLength){
	       length = xLength;
	   }

	   public void setWidth(double xWidth){
	       width = xWidth;
	   }

}
