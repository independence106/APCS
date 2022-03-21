import javax.xml.validation.Validator;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2, 1, 6};
		Deck cards = new Deck(ranks, suits, values);
		System.out.println(cards);

		System.out.println(cards.deal());
		System.out.println(cards.toString());
	}
}
