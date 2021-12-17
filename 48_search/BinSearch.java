
/**
   class BinSearch
   Binary search on array of Comparables
**/

public class BinSearch
{

 
  public static int binSearch ( Comparable[] a, Comparable target ) {
    

    return binSearchIter( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( Comparable[] a, Comparable target, 
                                  int lo, int hi )
  {
    int tPos = -1; 

    int m = (lo + hi) / 2;

    if (lo > hi)
      return tPos; 
    if ( a[m].compareTo(target) == 0 ) 
      tPos = m;
    
    else if ( a[m].compareTo(target) > 0 ) 
      tPos = binSearchRec( a, target, 0, m-1 );
  
    else if ( a[m].compareTo(target) < 0 ) 
      tPos = binSearchRec( a, target, m+1, hi );

    return tPos;
  }


  public static int binSearchIter( Comparable[] a, Comparable target, 
                                   int lo, int hi )
  {
    int tPos = -1; 
    int m = (lo + hi) / 2; 

    while( lo <= hi ) { 

      m = (lo + hi) / 2; 

     
      if ( a[m].compareTo(target) == 0 ) 
        return m;

      
      else if ( a[m].compareTo(target) > 0 ) 
        hi = m - 1; 

      
      else if ( a[m].compareTo(target) < 0 ) 
        lo = m + 1; 
    }
    return tPos;
  }



  private static boolean isSorted( Comparable[] arr )
  {
    boolean retBoo = true; 
    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i].compareTo(arr[i+1]) > 0 ) ) {
        return false;
      }
    }
    return retBoo; 
  }

  private static void printArray( Comparable[] arr ) {
    String output = "[ "; 

    for( Comparable c : arr )
      output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }



  
  public static void main ( String[] args ) {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    System.out.println("\nNow testing binSearch on Comparable array...");

    //Declare and initialize array of Comparables
    Comparable[] iArr = { 2, 4, 6, 8, 6, 42 };
    printArray( iArr );
    System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

    Comparable[] iArr2 = { 2, 4, 6, 8, 13, 42 };
    printArray( iArr2 );
    System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );

    Comparable[] iArr3 = new Integer[10000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }

    //printArray( iArr3 );
    System.out.println( "iArr3 sorted? -- " + isSorted(iArr3) );

    //search for 6 in array 
    System.out.println( binSearch(iArr2,2) );
    System.out.println( binSearch(iArr2,4) );
    System.out.println( binSearch(iArr2,6) );
    System.out.println( binSearch(iArr2,8) );
    System.out.println( binSearch(iArr2,13) );
    System.out.println( binSearch(iArr2,42) );

    //search for 43 in array 
    System.out.println( binSearch(iArr2,43) );

    System.out.println( "now testing binSearch on iArr3..." );
    System.out.println( binSearch(iArr3,4) );
    System.out.println( binSearch(iArr3,8) );
    System.out.println( binSearch(iArr3,5) );

    //search for 43 in array 
    System.out.println( binSearch(iArr3,43) );


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class BinSearch2