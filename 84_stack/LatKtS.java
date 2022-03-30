// Team Purple Pineapples: Jason Zhou, Russell Goychayev, Marcus Wu
// APCS pd7
// HW84: Stack: What Is It Good For?
// 2022-03-29
// time spent: 0.4 hr

// Disco: everything is possible w/o peek

// QCC:

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(1);
    String retVal = "";
    int hrr = 1;
    for (int i = 0; i < s.length(); i++) {
      stack.push(s.substring(i, i+1));
      hrr += 1;
    }
    for (int i = 0; i < hrr - 1; i++) {
      retVal += stack.pop();
    }
    return retVal;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    String[] open = {"(", "{", "["};
    String[] close = {")", "}", "]"};
    Latkes stack = new Latkes(1);

    for (int i = 0; i < s.length(); i++) {
      String ting = s.substring(i, i+1);
      if (isInArray(ting, close)) {
        String tempVal = (stack.isEmpty()) ? "" : stack.pop(); // re add (because no method called head rn)
        if (tempVal == null) {
          tempVal = "";
        }
        if (!(tempVal.equals(open[posInArray(ting, close)]))) { // if ( == ( then we will pop or do nothing
          return false;
        }
      } else {
        stack.push(s.substring(i, i+1));
      }
    }
    return stack.pop() == null;
  }

  private static boolean isInArray(String search, String[] vals) {
    for (int i = 0; i < vals.length; i++) {
      if (search.equals(vals[i])) {
        return true;
      }
    }
    return false;
  }

  private static int posInArray(String search, String[] vals) {
    for (int i = 0; i < vals.length; i++) {
      
      if (search.equals(vals[i])) {
        return i;
      }
 
    }
    return -1;
  }


  //main method to test
  public static void main( String[] args )
  {
    
    System.out.println(flip("stressed"));
    System.out.println(flip("racecar"));
    
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
