// Silly Serpents; Jason Zhou, Vansh Saboo, Tiggy, Tiffany
// APCS pd8
// HW44: Array of Grade 316
// 2021-12-07
// Time spent: 0.2 hrs

/***************************
 * Disco:
 * QCC: 
 ***************************/

public class SuperArray implements ListInt{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ ) {
      temp[i] = _data[i];
    }
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  

  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    //100% wrong but just because
    _size++;
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
    _data[_size] = newVal;
    _size++;
    /* YOUR IMPLEMENTATION HERE */
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    for (int i = _size; i > index; i--) {
      _data[i] = _data[i - 1];
    }
    _data[index] = newVal;
    _size++;
    /* YOUR IMPLEMENTATION HERE */
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    _data[index] = 0;
    for (int i = index; i < _size - 1; i++) {
      _data[i] = _data[i + 1];
    }
    _size--;

  }


  //return number of meaningful items in _data
  public int size()
  {
    return _size;
    /* YOUR IMPLEMENTATION HERE */
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
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }

      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);


      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);


      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);

  }//end main()


}//end class
