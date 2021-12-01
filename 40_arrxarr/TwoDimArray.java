/******************************
 * class TwoDimArray
 *
 * practice working with 2D arrays
 ******************************/

// Silly Serpents; Roster: Jason Zhou, Vansh Saboo, Tiggy, Tiffany
// APCS pd8
// HW40 -- 2D arrays
// 2021-11-30
// Time taken: 0.2 hr

// Disco: for each seems to work rlly well w/ sums. 

// QCC:

public class TwoDimArray
{

  //Helper function (not part of hw)

  public static void printArr(int[] a) {
    String oneLine = "";
    for (int e : a) {
      oneLine += e + " ";
    }
    System.out.println(oneLine);
  }
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      printArr(a[i]);
    }
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {

    for (int[] f : a) {
      for (int i : f) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }

      // YOUR IMPLEMENTATION
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum = 0;
    for (int[] f : a) {
      for (int i : f) {
        sum += i;
      }
    }
    return sum;
    // YOUR IMPLEMENTATION HERE
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )

  {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += sumRow(i, m);
    }
    return sum;
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sum = 0;
    for (int i = 0; i < a[r].length; i++) {
      sum += a[r][i];
    }
    return sum;
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for (int e : m[r]) {
      summer += e;
    }
    return summer;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };

      
      
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
