// Silly Serpents; Jason Zhou, Vansh Saboo, Tiggy, Tiffany
// APCS pd8
// HW47: Guess Again
// 2021-12-14
// Time spent: 0.2 hrs

/***************************
 * Disco:
 * QCC: 
 - Math.random() produces a value in [0, 1), which is then scaled by (b - a) to become [0, b - a), and then shifted by a units to [a, b) - however, given that it is
  " b) ", it would never produce the maximum value, b. Should this be counteracted by scaling Math.random() by (b + 1 - a) so that the final domain would be like 
  [a, b + 1), which is effectively [a, b]? Or does this not matter?
 
 ***************************/

import java.util.Scanner;
public class GuessNumber{
    
    private int _lo, _hi, _guessCtr, _target;
    Scanner sc = new Scanner(System.in);
    
    public GuessNumber(int a, int b){
        _lo = a;
        _hi = b;
        _guessCtr = 1;
        _target = (int) (Math.random() * (b - a)) + a;
    }
    
    public void playIter(){
        int guess;
        while(true){
            
            System.out.println("Guess a number between " + _lo + " & " + _hi + ": ");
            guess = sc.nextInt();
            if (guess < _lo || guess > _hi) {System.out.println("Choose a value within the bounds!"); }
            else{ 
                if(guess == _target) break;
                if(guess > _target)  { // If the guess is greater than the target, update the upper bound  
                    System.out.println("Too high"); 
                    _hi = guess - 1;
                }  
                else { // else if the guess is less than the target, update the lower bound
                    System.out.println("Too low"); 
                    _lo = guess + 1;
                } 
                _guessCtr++;
            }
        }
        System.out.println("Correct! It took " + _guessCtr + " guesses");
    }
    public void play(){
        playIter();
    }
    public static void main(String[] args){
        GuessNumber g = new GuessNumber(1, 100);
        g.play();
    }
}
