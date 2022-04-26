/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
import java.util.Scanner.*;

public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		CelebrityGame game = new CelebrityGame();
		game.prepareGame();
		game.play();
	}
}
