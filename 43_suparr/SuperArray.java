// Silly Serpents; Jason Zhou, Vansh Saboo, Tiffany, Tiggy
// APCS pd8
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07

//Disco: 
//Qcc: is there a way to do set w/o a temp variable?
//Time spent: 0.2 hr
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10];
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String temp = "[";
    for (int i = 0; i < _data.length - 1; i++) {
        temp += _data[i] + ", ";
    }
    return temp + _data[_data.length-1] + "]";

  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = _data;
    _data = new int[temp.length * 2];
    for (int i = 0; i < temp.length; i++) {
        _data[i] = temp[i];
    }

    /* YOUR IMPLEMENTATION HERE */
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    int temp = get(index);
    _data[index] = newVal;
    return temp;
  }


  //main method for testing
  public static void main( String[] args )
  {
    
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      
  }//end main()


}//end class
    