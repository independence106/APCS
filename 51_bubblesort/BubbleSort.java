// Silly Serpents: Jason Zhou, Vansh Saboo, Tiggy, Tiffany
// APCS pd8
// HW51: Dat Bubbly Tho -- implementing bubblesort
// 2022-01-03
// time spent: 0.2 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 *    - Go through the array, swapping adjacent elements if needed
 *    - repeat 
 *
 * DISCO:
 *    - Bubble sort works in O(n^2)
 *    - The reason why it's n passes is because since you can only swap w/ adjacent elements you need to swap n times
 *      to bring [x, x, x, leastnum] to [leastnum, x, x, x]
 *    - Can be further optimized to run faster
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The array is sorted
 * q1: After pass p, what do you know?
 * a1: The first p elements are sorted
 * q2: How many passes are necessary to completely sort?
 * a2: n passes
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
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
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    /* YOUR IMPLEMENTATION HERE */
    //further optimization
    boolean isSorted = true;

    int size = data.size();
    for (int i = 0; i < size; i++) {
      for (int j = size - 1; j > 0; j--) {
        //swapping
        isSorted = true;
        if (data.get(j).compareTo(data.get(j - 1)) < 0) {
          isSorted = false; //you swap at least once
          int temp = (int) data.get(j);
          int temp2 = (int) data.get(j - 1);
          data.remove(j);
          data.add(j, temp2);
          data.remove(j - 1);
          data.add(j - 1, temp);
         
        }
        
      }
      if (isSorted) {
        break;
        
      }
    }
    
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    
    int size = input.size();
    for (int i = 0; i < size; i++) {
      for (int j = size - 1; j > 0; j--) {
        //swapping
        if (input.get(j).compareTo(input.get(j - 1)) < 0) {
          int temp = (int) input.get(j);
          int temp2 = (int) input.get(j - 1);
          input.remove(j);
          input.add(j, temp2);
          input.remove(j - 1);
          input.add(j - 1, temp);
         
        }
      }
    }
    return input;

  }
  


  public static void main( String [] args )
  {

    
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
   

   
      ArrayList gplen = new ArrayList<Integer>();
      gplen.add(7);
      gplen.add(1);
      gplen.add(5);
      gplen.add(12);
      gplen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + gplen );
      ArrayList glenSorted = bubbleSort( gplen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + gplen );

      ArrayList cocoo = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + cocoo );
      ArrayList cocoSorted = bubbleSort( cocoo );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + cocoo );
      System.out.println( cocoo );


  }//end main

}//end class BubbleSort
