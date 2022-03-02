// Team JZ Gang: Jason Zhou, Jomin Zhang, Jaylen Zeng
// APCS pd7
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent: 0.5 hrs

/***
 * 
 * ALGO
 *  - We just randomly generate possible moves and go through the recusion stack until we either complete a tour or 
 *    if we can't continue, which we then backtrack to the last possible move
 *
 * DISCO
 *  - Liveshare = teamwork unleashed
 *    very poggers
 *
 * QCC
 *  - optimization by having it keep track of a grid w/ possible movement thingies
 *
 *
 * Mean execution times for boards of size n*n:
 * n=5   __s    across __ executions
 * n=6   __s    across __ executions
 * n=7   __s    across __ executions
 * n=8   __s    across __ executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/

import java.io.*;
import java.util.*;

public class KnightTour {
    public static void main(String[] args) {
        int n = 5;

        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalid input. Using board size "
                    + n + "...");
        }

        TourFinder tf = new TourFinder(n);

        // clear screen using ANSI control code
        System.out.println("[2J");

        // display board
        System.out.println(tf);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // for fixed starting location, use line below:
        tf.findTour( 2, 2, 1 );
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // for random starting location, use lines below:
        // int startX = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
        // int startY = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
        // tf.findTour( startX, startY, 1 ); // 1 or 0 ?
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // PUSHING FARTHER...
        // Systematically attempt to solve from every position on the board?
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    }// end main()

}// end class KnightTour

class TourFinder {
    // instance vars
    private int[][] _board;
    private int _sideLength; // board has dimensions n x n
    private boolean _solved = false;

    private int[] movesRight = {2, 2, 1, 1, -1, -1, -2, -2};

    // constructor -- build board of size n x n
    public TourFinder(int n) {
        _sideLength = n;

        // init 2D array to represent square board with moat
        _board = new int[_sideLength + 4][_sideLength + 4];
        // SETUP BOARD -- 0 for unvisited cell
        // -1 for cell in moat
        // ---------------------------------------------------------
        for (int i = 0; i < _sideLength + 4; i++) {
            for (int o = 0; o < _sideLength + 4; o++) {
                _board[i][o] = -1;
            }
        }
        for (int i = 2; i < _sideLength + 2; i++) {
            for (int o = 2; o < _sideLength + 2; o++) {
                _board[i][o] = 0;
            }
        }
        // ---------------------------------------------------------

    }// end constructor

    /**
     * "stringify" the board
     **/
    public String toString() {
        // send ANSI code "ESC[0;0H" to place cursor in upper left
        String retStr = "[0;0H";
        // emacs shortcut: C-q, then press ESC
        // emacs shortcut: M-x quoted-insert, then press ESC

        int i, j;
        for (i = 0; i < _sideLength + 4; i++) {
            for (j = 0; j < _sideLength + 4; j++)
                retStr = retStr + String.format("%3d", _board[j][i]);
            // "%3d" allots 3 spaces for each number
            retStr = retStr + "\n";
        }
        return retStr;
    }

    /**
     * helper method to keep try/catch clutter out of main flow
     * 
     * @param n delay in ms
     **/
    private void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }

    /**
    * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking
    algo
    * to find valid knight's tour
    * @param x starting x-coord
    * @param y starting y-coord
    * @param moves number of moves made so far
    **/
    public void findTour( int x, int y, int moves )
    {
    // delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation 
    
    if ( this._solved ) {
      System.out.println("SOLVED");
      System.exit(0);
    } 
        
    //primary base case: tour completed
    if (  moves == Math.pow(this._sideLength, 2) + 1 ) {
        this._solved = true;
        System.out.println( this._board ); //refresh screen
        return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
        return; 
    }

    else {

    //mark current cell with current move number
    _board[x][y] = moves;

    System.out.println( this ); //refresh screen

    // delay(1000); //uncomment to slow down enough to view
    
    findTour(x + 2, y + 1, moves + 1);
    findTour(x + 2, y - 1, moves + 1);
    findTour(x + 1, y + 2, moves + 1);
    findTour(x + 1, y - 2, moves + 1);
    findTour(x - 2, y + 1, moves + 1);
    findTour(x - 2, y - 1, moves + 1);
    findTour(x - 1, y + 2, moves + 1);
    findTour(x - 1, y - 2, moves + 1);

    _board[x][y] = 0;


    System.out.println( this ); //refresh screen
    
    }
    }//end findTour()

}// end class TourFinder