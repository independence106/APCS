/***
 * Jason Zhou (Dunking Ducks: Roster: Jason Zhou, Daniel Jung, Tiggy, Ralph)
 * APCS
 * HW24: Get It While You Can (Edited Driver.java)
 * 2021 - 10 - 25
 * Time spent: In class time + 8 minutes outside class
 * 
 * Disco: N/A
 * QCC: N/A
 ***/

public class Driver {

    public static void main( String[] args ) {
  
      //build Objects from blueprint specified by class Coin
  
  /*
      //test default constructor
        Coin mine = new Coin();
        //test 1st overloaded constructor
        Coin yours = new Coin( "quarter" );
        //test 2nd overloaded constructor
        Coin wayne = new Coin( "dollar", "heads" );
        //test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);
        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);
        //test equals() method
        if ( yours.equals(wayne) ) {
          System.out.println( "Matchee matchee!" );
        }
        else {
          System.out.println( "No match. Firestarter you can not be." );
        }
  */
      Coin e = new Coin();
      Coin y = new Coin();
      //x heads
      int x = 21;
      while (e.getHeadsCtr() + y.getHeadsCtr() < x) { 
          e.flip();
          y.flip();
      }
      System.out.println("Flip Counter: " + e.getFlipCtr() + y.getHeadsCtr() + "\n");
      System.out.println("Heads Flip Counter: " + e.getHeadsCtr() + y.getHeadsCtr() + "\n");
      System.out.println("Tails Flip Counter: " + e.getTailsCtr() + y.getHeadsCtr() + "\n\n");
      
      //y matches
      e.reset("penny", 0.5);
      int z = 21;
      /*while (e.getFlipCtr() < y && e.getUpFace().equals(y.getUpFace())) {
          e.flip();
      }
      */
      System.out.println("Flip Counter: " + e.getFlipCtr() + "\n");
      System.out.println("Heads Flip Counter: " + e.getHeadsCtr() + "\n");
      System.out.println("Tails Flip Counter: " + e.getTailsCtr() + "\n\n");
       
      e.reset("penny", 0.5);
    	//e.flip();
    	
    	int matchCtr = 0;
    	while (matchCtr < 65536 || matchCtr % 2005 != 0) {
    		e.flip();
    		y.flip();
    		if (e.getUpFace().equals(y.getUpFace())) { matchCtr++; }
    	}
    

      
      System.out.println("Flip Counter: " + e.getFlipCtr() + "\n");
      System.out.println("Heads Flip Counter: " + e.getHeadsCtr() + "\n");
      System.out.println("Tails Flip Counter: " + e.getTailsCtr() + "\n\n");
      System.out.println(matchCtr);
      
      
    }//end main()
  
  }//end class
