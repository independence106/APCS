/* 
   Jason Zhou
   APCS
   HW12: On Elder Individuality and the Elimination of Radio Fuzz (Edit BigSib w/ 2 new methods)
   2021-10-05

   Discoveries: n/a
   Unresolved Questions: Is there a faster + easier way to do this?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } 
} 