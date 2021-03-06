import java.util.Random;

/*****************************************************
 * Team: Silly Serpents
 * Team Members (+ Duckies): Vansh Saboo, Jason Zhou: Duckies: Tiggy, Tiffany
 * APCS Pd. 8
 * HW49: Rational Standards Compliance
 * 2021-12-22
 - Time Spent : 0.3 hours
 - DISCO: instanceof
 - QCC: N/A
 *****************************************************/

public class Rational implements Comparable {
    private int numerator;
    private int denominator;
    private final double ERROR;

    public Rational(){
        numerator = 0;
        denominator = 1;
        ERROR = 0.000000000001;
    }
    public Rational(int num, int denom){
        this();
        if(denom != 0){
            numerator = num;
            denominator = denom;
        }
        else{ System.out.println("You can not use a denominator of 0. This Rational object has been set to 0/1");  }
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

   public int gcd(){
        if(this.numerator == 0){return 0;}
        int num = Math.abs(this.numerator);
        int denom = Math.abs(this.denominator);

        while(num != denom){
            if(num > denom){num -= denom;}
            else{denom -= num;}
        }
        return num;
    }

    public void reduce(){
        if(gcd() != 0){
            this.numerator /= gcd();
            this.denominator /= gcd();
        }
        if(this.denominator < 0){
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }
    public boolean equals(Object o) {
        if (!(o instanceof Rational)) return false;
        return (this.floatValue() == ((Rational) o).floatValue());
    }
    public int compareTo(Object r){
        /*
        a/b     ___ c/d
        bd(a/b) ___ (c/d)bd  *
        ad      ___ bc
        ad - bc ___ 0
        Return ad - bc, unless bd is negative (would invert the inequality - return bc - ad instead)
        */
        if (r instanceof Rational) {
            Rational o = (Rational) r;
            int leftProduct = this.numerator * o.denominator;
            int rightProduct = this.denominator * o.numerator;
            if(this.denominator * o.denominator < 0){return rightProduct - leftProduct;}
            else{return leftProduct - rightProduct;}
        } else {
            throw new ClassCastException("\nNot a Rational!");
        }
        
    }

    public double floatValue(){
        return (double) numerator / denominator;
    }

    public void multiply(Rational other){
        // a/b * c/d = ac/bd
        numerator *= other.numerator;
        denominator *= other.denominator;
    }
    public void divide(Rational other){
      // Dividing by a rational value p/q  is the same as multiplying by its reciprocal, q/p
        if(other.numerator != 0){
            numerator *= other.denominator;
            denominator *= other.numerator;
        }
        else{System.out.println("Division by 0 error!");}
    }

    public void add(Rational other){
        // a/b + c/d = d(a/b) + b(c/d) = ad/bd + bc/bd = (ad + bc)/bd
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
    }

    public void subtract(Rational other){
        // a/b - c/d = d(a/b) - b(c/d) = ad/bd - bc/bd = (ad - bc)/bd
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator *= other.denominator;
    }
    
}
