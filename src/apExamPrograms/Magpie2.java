package apExamPrograms;

public class Magpie2 {
boolean good=false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		if(statement.indexOf("dog") >=0 || statement.indexOf("cat")>=0) {
			response= "Tell me more about your pets.";
		}
		if(statement.indexOf("favorite")>=0 && statement.indexOf("sport")>=0 
				||statement.indexOf("favorite")>=0 && statement.indexOf("activity")>=0){
		response= "Thats cool that you like to do that!";
		}
		for(int i=0; i<statement.length()-1; i++) {
			if(statement.charAt(i)!= ' ') {
			good=true;
			}
			else {
				good=false;
			}
		}
		
		else{
			response = getRandomResponse();
		}
		return response;
		}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
