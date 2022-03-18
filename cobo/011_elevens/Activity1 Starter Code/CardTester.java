/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card spadeSeven = new Card("Seven", "Spade", 10);
		
		Card cloverSeven = new Card("Seven", "Clover", 1);
		
		Card cloverKing = new Card("King", "Clover", 10);

		System.out.println(spadeSeven.toString());
		System.out.println(cloverKing.toString());
		System.out.println(cloverSeven.toString());

		System.out.println(cloverKing.matches(cloverSeven));
	}
}
