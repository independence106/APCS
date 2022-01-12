public class MySorts {
    public static void bubbleSort( ArrayList<Comparable> data )
    {
      for(int passes = 0; passes < data.size()-2; passes++) {
        boolean sorted = true;
        for(int index = data.size()-1; index > passes; index--) {
          if(data.get(index).compareTo(data.get(index-1)) < 0) {
            Comparable temp = data.get(index);
            data.set(index, data.get(index-1));
            data.set(index-1, temp);
            sorted = false; // basically determines whether or not a swap happens
          }
        }
        if(sorted) {
          break;
        }
      }
    }

    public static void selectionSort( ArrayList<Comparable> data )
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

  public static void insertionSort( ArrayList<Comparable> data )
  {
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i-1).compareTo(data.get(i)) > 0) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

          Comparable temp = data.get(i);
          data.remove(temp);
          data.add(i-1, temp);
          
        }
        else
          break;
      }
    }
  }//end insertionSortV
}