package loops;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		int j;


	for(j=1; j<=5; j++)
	{
		for(counter=1; counter<=5; counter=counter+1)
		{
			if(counter==3)
			{
			System.out.println(j);
			}
			else
			{
				System.out.println(counter); 
			}
			
			
		}
	}
	
	}

	}


