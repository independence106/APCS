/*****************************************************
 * Team: Silly Serpents
 * Team Members (+ Duckies): Vansh Saboo, Jason Zhou: Duckies: Tiggy, Tiffany
 * APCS Pd. 8
 * HW42 -- Be More Rational
 * 2021-12-04
 - Working with Rational objects
 - Time Spent : 0.5 hours
 - DISCO:
    - For the compareTo method, given the constraints, you could try to return ad - bc when comparing a/b to c/d
    a/b ___ c/d
    bd(a/b)  ___ bd(c/d)
    ad ___ bc
    ad - bc ___ 0

    (If a/b > c/d, then ad - bc > 0 (+),
    if ad = c/d, then ad - bc = 0,
    and if a/b < c/d, then ad - bc < 0 (-) )
    This would under normal circumstances comply with the expected outputs (positive when a/b > c/d, 0 when a/b = c/d, negative when a/b < c/d)

    - Allowing p & q to be negative complicates the code a lot:
        - For the GCD method, if p or q are negative, then the subtraction will repeat continually - so use the absolute values of the numerator & denominator instead
        - For the reduce method, if the denominator is negative, then it's cleanest to negate both the numerator and the denominator,
        since if both of them are negative, then they'd both be made positive, and otherwise it's cleaner to have -p/q compared to p/-q
        - The compareTo method returning ad - bc would break down if bd were negative, since you multiply it to both sides of the inequality,
        and multiplying both sides by a negative value would inverse the inequality. This can be counteracted by multiplying both sides by -1
        to re-invert the inequality, so you would return bc - ad instead

 - QCC: N/A
 *****************************************************/

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        numerator = 0;
        denominator = 1;
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
        Rational e = (Rational) o;
        try {}
        if (!(o instanceof Rational)) throw new Exception("Not a Rational");
        return (this.compareTo((Rational) o) == 0);
    }
    public int compareTo(Rational r){
        /*
        a/b     ___ c/d
        bd(a/b) ___ (c/d)bd  *
        ad      ___ bc
        ad - bc ___ 0
        Return ad - bc, unless bd is negative (would invert the inequality - return bc - ad instead)
        */

        int leftProduct = this.numerator * r.denominator;
        int rightProduct = this.denominator * r.numerator;
        if(this.denominator * r.denominator < 0){return rightProduct - leftProduct;}
        else{return leftProduct - rightProduct;}
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
    public static void main(String[] args){
      Rational first = new Rational(3, 5);
      Rational second = new Rational(7, 8);

      Rational third = new Rational(6, 10);

      Rational fourth = new Rational(1, 3);

      System.out.println("First equals second? " + first.compareTo(second));
      System.out.println("thrid equals fourth? " + third.compareTo(fourth));

    }
}
