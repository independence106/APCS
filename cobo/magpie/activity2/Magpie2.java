/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
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
	//Problem with this is that it depends the order of words
	//IE: I like food and I have a dog.
	//To prioritize, you have to put the one you want first
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().length() == 0) response = "say something";
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		} else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0) {
					response = "how old?";
				}
		else if (statement.indexOf("Mr. Mykolyk") >= 0
				|| statement.indexOf("Mykolyk") >= 0) {
					response = "He sounds like a good teacher, tell me more";
				}
		else if (statement.indexOf("Money") >= 0
				|| statement.indexOf("cash") >= 0) {
					response = "bread";
				}
		else if (statement.indexOf("food") >= 0
				|| statement.indexOf("yummy") >= 0) {
					response = "What did it taste like?";
				}
		else if (statement.indexOf("games") >= 0
				|| statement.indexOf("video games") >= 0) {
					response = "OOOh I also play games tell me more";
				}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else
		{
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
		final int NUMBER_OF_RESPONSES = 6;
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
		else if (whichResponse == 4) {
			response = "Cool";
		}
		else if (whichResponse ==  5) {
			response = "I see.";
		}

		return response;
	}
}