package OOP;

public class Friend {

		   private String name;
		   private int age;
		    
		   public Friend()
		    {
		     name = "";
		     age  = 0;
		    }
		    public Friend(String n, int a)
		    {
		     name = n;
		     age  = a;
		    }

		    public String getName()
		    {
		     return name;
		    }
		    public int getAge()
		    {
		     return age;
		    }
		    
		    public void setName(String n)
		    {
		     name = n;
		    }
		    public void setAge(int a)
		    {
		     age = a;
		    }

}
// two different files 1. class def which is a blueprint 2. test class that has a main method in it 