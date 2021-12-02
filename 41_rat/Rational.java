// Silly Serpents; Roster: Jason Zhou, Vansh Saboo, Tiggy, Tiffany
// APCS pd8
// HW41: Be Rational
// 2021-12-1
// Time taken: 0.2 hr

// Disco: helper methods helpful

// QCC:

public class Rational {

    private int num;
    private int denom;

    public Rational() {
        this.num = 0;
        this.denom = 1;
    }

    public Rational(int num, int denom) {
        this();
        if (denom != 0) {
          this.num = num;
          this.denom = denom;
        } else {
            System.out.println("Invalid Denominator, should not be 0");

        }

    }

    public String toString() {
        return num + " / " + denom;
    }

    public double floatValue() {
        double value = (double) num / denom;
        return value;
    }

    public void multiply(Rational r) {
        this.num *= r.num;
        this.denom *= r.denom;
    }

    public void divide(Rational r) {
        if (r.num == 0) {
            System.out.println("Divide by zero error!");
        } else {
            this.num *= r.denom;
            this.denom *= r.num;
        }

    }

    public void add(Rational r) {
        int oldDenom = this.denom;
        this.num *= r.denom;
        this.denom *= r.denom;
        this.num += r.num * oldDenom;
        this.reduce();
    }

    public void subtract(Rational r) {
        int oldDenom = this.denom;
        this.num *= r.denom;
        this.denom *= r.denom;
        this.num -= r.num * oldDenom;
        this.reduce();
    }
    public int gcd() {
       if(this.num == 0 || this.denom == 0){return 0;}
       int numerator = this.num;
       int denominator = this.denom;
       while(numerator != denominator){
           if(numerator > denominator){numerator -= denominator;}
           else{denominator -= numerator;}
       }
       return numerator;
    }

    public void reduce(){
       this.num /= gcd();
       this.denom /= gcd();
    }
    public int compareTo(Rational r){
       int leftProduct = this.num * r.denom;
       int rightProduct = this.denom * r.num;
       if(leftProduct == rightProduct){return 0;}
       if(leftProduct > rightProduct){return 1;}
       return -1;
    }


    public static void main(String[] args) {
        Rational r = new Rational(2, 3);
        Rational z = new Rational(6, 8);
        r.subtract(z);
        System.out.println(r.toString());

        //courtesy of Gabriel Thompson
        /*
        System.out.println("\ntoString() and constructor test cases:");
        Rational a = new Rational();
        System.out.println(a + " ...should be \"0 / 1\"");
        Rational b = new Rational(5, 2);
        System.out.println(b + " ...should be \"5 / 2\"");
        Rational c = new Rational(1, 0);
        System.out.println(c + " ...should yield error");

        System.out.println("\nfloatValue() test cases:");
        Rational d = new Rational(6, 3);
        System.out.println(d.floatValue() + " ...should be \"2.0\"");
        Rational e = new Rational(5, 3);
        System.out.println(e.floatValue() + " ...should be \"1.66666667\"");
        Rational f = new Rational(-18, 9);
        System.out.println(f.floatValue() + " ...should be \"-2.0\"");

        System.out.println("\nmultiply() test cases:");
        Rational g = new Rational(5, 4);
        Rational h = new Rational(6, 10);
        g.multiply(h);
        System.out.println(g + " ...should be \"30 / 40\"");
        Rational i = new Rational(5, 10);
        Rational j = new Rational();
        i.multiply(j);
        System.out.println(i + " ...should be \"0 / 10\"");

        System.out.println("\ndivide() test cases:");
        Rational k = new Rational(10, 3);
        Rational l = new Rational(6, 4);
        k.divide(l);
        System.out.println(k + " ...should be \"40 / 18\"");
        // This next test cases checks for how the class reacts to divison by 0 in the divide() function
        Rational m = new Rational(5, 5);
        Rational n = new Rational();
        m.divide(n);
        System.out.println(m + " ...should yield an error\n");
        */
    }

}
