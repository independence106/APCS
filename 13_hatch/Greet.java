/* 
   Jason Zhou [Emily, Applesauce, Tiggy]
   APCS
   HW13: Where do BigSibs Come From? (Edit BigSib w/ a Constructor)
   2021-10-06

   Discoveries: n/a
   Unresolved Questions: n/a
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word Up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } 
} 