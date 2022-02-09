/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ***/
/*
    JZ Gang: Jason Zhou, Jomin Zhang
    APCS
    HW61: Instructions so Simple...
    02-8-2022

    Disco: doing these types of sorts = bugs 
    QCC: using paper helped a lot

    Time Spent: 0.5 hours

 */
  public class MergeSort
  {
    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b )
    {
      int[] merged = new int[a.length + b.length];
      int placeA = 0;
      int placeB = 0;
      int counter = 0;
      while (placeA < a.length && placeB < b.length) {
        
        if (a[placeA] <= b[placeB]) {
          merged[counter] = a[placeA];
          placeA++;
        } else {
          merged[counter] = b[placeB];
          placeB++;
        }
        counter++;
      }
      if (placeA < a.length) {
        for (int i = placeA; i < a.length; i++) {
          merged[counter] = a[placeA];
          placeA++;
          counter++;
        }
      }
      if (placeB < b.length) {
        for (int i = placeB; i < b.length; i++) {
          merged[counter] = b[placeB];
          placeB++;
          counter++;
        }
      }
      return merged;
  
    }//end merge()
  
  
    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr )
    {
        if (arr.length == 1) {
        return arr;
        }
        
      int[] arr1 = new int[(arr.length / 2)];
      int[] arr2 = new int[arr.length - (arr.length / 2)];
      
      for (int i = 0; i < (arr.length / 2); i++) {
          arr1[i] = arr[i];
      }
      printArray(arr1);
      printArray(arr2);
      for (int p = 0; p < arr.length - ((arr.length / 2)); p++) {
        System.out.println(p);
        
        arr2[p] = arr[p + arr.length / 2];
        printArray(arr2);
      }
      
        

    return merge(sort(arr1), sort(arr2));
 
      
    }//end sort()
  
  
  
    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
      for( int i = 0 ; i<a.length; i++ )
        a[i] = 0;
    }
  
    //helper method for displaying an array
    public static void printArray( int[] a ) {
      System.out.print("[");
      for( int i : a )
        System.out.print( i + ",");
      System.out.println("]");
    }
    //---------------------------------------------------
  
  
    //main method for testing
    public static void main( String [] args )
    {
      
        int[] arr0 = {0, 23};
        int[] arr1 = {1, 9, 12, 15};
        int[] arr2 = {1,2};
        int[] arr3 = {3,4};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {4,3,2,1};
        int[] arr6 = {9,42,17,63,0,512,23};
        int[] arr7 = {9,42,17,63,0,9,512,23,9};
  
        System.out.println("\nTesting mess-with-array method...");
        printArray( arr3 );
        mess(arr3);
        printArray( arr3 );
  
        System.out.println("\nMerging arr1 and arr0: ");
        printArray( merge(arr1,arr0) );
  
        
  
        System.out.println("\nMerging arr4 and arr6: ");
        printArray( merge(arr4,arr6) );
  
        System.out.println("\nSorting arr4-7...");
        
        // printArray( sort( arr4 ) );
        
        // printArray( sort( arr5 ) );
        printArray( sort( arr6 ) );
        printArray( sort( arr7 ) );
        
    }//end main()
  
  }//end class MergeSort
  