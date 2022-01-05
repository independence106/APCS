// Frog Hats - Abdullah Faruque, Jason Zhou, Kevin Cheng
// APCS pd08
// HW52: Selection, Natch
// 2021-1-4
// time spent: 0.5 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO: find the greatest value and push it to the end of the arraylist. after every pass, decrease the max position so that the next greatest value will be put right before
 * the previous greatest value.
 *
 * DISCO-which sorting method is better?!
 *
 * QCC- none atm
 * q0: How many passes to sort n elements?
 * a0: length minus 1
 * q1: What do you know after pass p?
 * a1: the last size - p elements are sorted.
 * q2: How do you know if sorted?
 * a2: 
 * q3: What does a pass boil down to?
 * a3: finding the next greatest value and replacing it with the current max position.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = 0;

    for(int pass = data.size(); pass > 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      //check for greatest
      Comparable greatest = 0;
      for(int index = 0; index < pass; index++) {
        if(data.get(index).compareTo(greatest) > 0) {
          greatest = data.get(index);
          maxPos = index;
        }
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      }

      //shift
      data.add(pass, data.get(maxPos));
      data.remove(data.get(maxPos));

      
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    
    /* ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
 */

    
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      

  }//end main

}//end class SelectionSort