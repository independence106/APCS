/*
TEAM JZ GANG: Jason Zhou, Jaylen Zeng, Jomin Zhang
APCS 
Pd 7
2022 - 16 - 2
Time spent: 1 hr
Disco: Very tough
QCC: can we get more time?
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size ) 
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition: 
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   */
  public boolean solve()
  {
    addQueen(0, 0);
    for (int i = 1; i < _board.length; i++) {
      if (solveH(i));
    }
    int numQueens = 0;
    for (int i = 0; i < _board.length; i++) {
      for (int e = 0; e < _board.length; e++) {
        if (_board[i][e] == 1) {
          numQueens++;
        }
      }
    }
    if (numQueens == _board.length) {
      return true;
    }
    return false;
    /*
    

    start at 0,0

    for loop and loop through colums
    -call solveH on that column
    -continue
    -if solveH col is equal to col final than don't call solveH again
    -check if this solution is true
    -continue in the for loop until solution is found, otherwise if done return false
    */
  }


  /**
   *Helper method for solve. 
   */
  private boolean solveH( int col ) 
  {
    //looping throws rows
    if (col == _board.length) {
      return true;
    }
    
    int e = 0;
    for (int i = 0; i < _board.length; i++) {
      e = i;
      System.out.println(col);
      if (addQueen(i, col)) {
        if (solveH(col + 1)) {
          return true;
        } else {
          removeQueen(i, col);
        }
      }
    }
    
    /*
    take in column, and check if there is a placement
    for loop() 
    */

    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String printOut = "[\n";
    for (int rows = 0; rows < _board.length; rows++) {
      for (int cols = 0; cols < _board.length; cols++) {
        if (_board[rows][cols] == 1) {
          printOut += "Q, ";
        } else {
          printOut += "_, ";
        }
      }
      printOut += "\n";
    }
    printOut += "]";
    System.out.println(printOut);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description>
   * precondition: Row and col are actualy rows and colums
   * postcondition: adds a queen and adds attack positions if possible
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: row and col are actual spots
   * postcondition: removes a queen and removes attack positions
    */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: class is instantiated
   * postcondition: returns string representation
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(8);
    System.out.println(b);
    /** should be...
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
    */
    System.out.println(b._board.length);
    System.out.println(b.solve());
    b.printSolution();
    /** should be...
       0	1	-1	-2	-1	
       0	0	-2	0	0	
       0	-1	0	-1	0	
       1	-1	-1	-1	-2	
       0	-1	0	0	0	
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1	
       0	0	-1	0	0	
       0	0	0	-1	0	
       0	0	0	0	-1	
       0	0	0	0	0	 
    */
    QueenBoard c = new QueenBoard(4);
    c.addQueen(0, 0);
    c.addQueen(2, 1);
    System.out.println(c);
    
  }

}//end class
