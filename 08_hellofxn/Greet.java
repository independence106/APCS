import java.util.Scanner;  // Import the Scanner class

public class Greet {
	public static void main(String[] args) {
		//scanner for fun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scan.nextLine();
		greeterInput(name);
		
		
		//greeterPersonalized("Why hello there friend. This is not the first time we have met. \n I am constantly watching you forever and ever.");
	}
	public static void greeterPersonalized(String string) {
		System.out.println(string);
		
	}
	public static void greeterInput(String string) {
		System.out.println("Why hello there " + string + "! I see you when you're sleeping...");
	}
	
}

/* 
Discoveries:

javac x.java
java x

Questions:

None so far...

*/
