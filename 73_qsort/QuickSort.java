/* DISCLAIMER: I DID NOT DO THIS HOMEWORK, I LEFT SCHOOL AT 3:45 AND WAS ON A COACH BUS W/O INTERNET UNTIL 1:00 AM (cause robotics) */

//Jason Zhou
//APCS pd7
//HW73 -- QuickSort
//2022-03-09w
//time spent: -1 h

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    qSortHelpr(d, 0, d.length-1);
  }


  /***
   * void qSortHelpr(int[], int, int)
   * @param arr -- array of ints to be sorted in place
   * @param loPos -- lower bound for partition range
   * @param hiPos -- upper bound for partition range
   ***/
  public static void qSortHelpr( int[] arr, int loPos, int hiPos ) {
    if ( loPos < hiPos ) {
      int pvtPos = partition(arr, loPos, hiPos);
      qSortHelpr(arr, loPos, pvtPos-1);
      qSortHelpr(arr, pvtPos+1, hiPos);
    }
  }


  /**
   * int partition(int[], int, int, int)
   * DESCRIP
   *
   * @param arr    input array of ints
   * @param loPos  leftmost index
   * @param hiPos  rightmost index
   * @return int   position of pivot
   */
  public static int partition( int arr[], int loPos, int hiPos )
  {
    //pick random pivot
    int pvtPos = loPos + (int)(Math.random() * (hiPos-loPos));

    int pvtVal = arr[pvtPos];

    swap( pvtPos, hiPos, arr);

    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= pvtVal ) {
        swap( i, s, arr );
        s++;
      }
    }
    swap(s, hiPos, arr);

    return s; //return pos where pvt landed
  }//end partition


  //main method for testing
  public static void main( String[] args )
  {
    //int [] arr1 = {7,1,5,12,3};
    //qsort( arr1 );

    int [] arr2 = {7,1,5,12,3,7};
    qsort( arr2 );
  }//end main

}//end class QuickSort
