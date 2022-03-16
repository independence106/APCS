/**
 *Team Purple Pineapples: Jason Zhou, Marcus Wu, Russell Goychayev
 *APCS pd7
 *HW76 -- We Got a Little Ol' Convoy
 *2022-03-14
 *time spent: 0.6 hr
 */

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

/**
 * DISCO: N/A
 * 
 * QCC: N/A
 * 
 */
public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList()
  {
    // YOUR CODE HERE
    //nothing goes here unless u want an error

  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    // YOUR CODE HERE
    //do this the first time (head has no pointers)
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode holder = _head;
    int num = 0;
    while (num < index) { 
      holder = holder.getNext();
      num++;
    }
    return holder.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode holder = _head;
    int num = 0;
    while (num < index) {
      holder = holder.getNext();
      num++;
    }
    String oldCargo = holder.getCargo();
    holder.setCargo(newVal);
    return oldCargo;
  }


  //return number of nodes in list
  public int size()
  {
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------

  public String remove(int index)
  {
    //OMG IM DYING THAT IS THE UGLIST CODE I'VE WRITTEN
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    if (index == 0) {
      String val = _head.getCargo();
      _head = _head.getNext();
      _size--;
      return val;
      
    }
    String returnVal = "";
    LLNode holder = _head;
    for (int i = 0; i < index - 1; i++) {
      holder = holder.getNext();
    } 
    returnVal = holder.getNext().getCargo();
    holder.setNext(holder.getNext().getNext());
    _size--;
    return returnVal;
  }

  public void add( int index, String newVal ) 
  {
    if ( index < 0 || index > size() )
      throw new IndexOutOfBoundsException();
    LLNode holder = _head;
    if (index == 0) {
      _head = new LLNode(newVal, holder);
      
    } else {
      for (int i = 0; i < index - 1; i++) {
        holder = holder.getNext();
      }
      holder.setNext(new LLNode(newVal, holder.getNext()));
    }
    
   

  }

  // override inherited toString
  public String toString()
  {
    // YOUR CODE HERE
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    
    LList james = new LList();
    james.add("elmo");
    james.add("fineas");
    james.add(0, "flea");
    System.out.println(james);
    System.out.println(james.get(0));
    
    System.out.println(james);
    
  }

}//end class LList
