import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Rational first = new Rational(3, 5);
        Rational second = new Rational(7, 8);
        Rational third = new Rational(6, 10);
        Rational fourth = new Rational(1, 3);
        Rational fifth = fourth;
        Rational six = new Rational(1, 3);
        Rational seven = new Rational(6, 10);
        Rational eight = new Rational(3, 5);
        Random o = new Random();

  
        Rational nine = new Rational(4, 5);
        Rational ten = new Rational(5, 6);
        Rational eleven = new Rational(-5, 6);
        Rational twelve = new Rational(5,6);
        Rational thirteen = new Rational(4, 5);

        System.out.println("First equals second? " + first.equals(second)); //SHOULD RETURN FALSE
        System.out.println("thrid equals fourth? " + third.equals(fourth)); //SHOULD RETURN FALSE
  
        System.out.println("fourth equals fifth? " + fourth.equals(fifth)); //SHOULD RETURN True
        System.out.println("fourth equals fifth? (Backwards)" + fifth.equals(fourth)); //SHOULD RETURN TRUE
        System.out.println("six equals fourth? " + six.equals(fourth)); //SHOULD RETURN TRUE
  
        //What about 3/10 and 6/20? (and ect)
        System.out.println("seven equals eight? " + seven.equals(eight)); //SHOULD RETURN TRUE
        System.out.println("eight equals o?" + eight.equals(o)); //SHOULD FALSE
  
        System.out.println("nine compareTo ten?" + nine.compareTo(ten)); //SHOULD BE Negative
        System.out.println("eleven compareTo twelve?" + eleven.compareTo(twelve)); //SHOULD negative
        System.out.println("twelve compareTo eleven?" + twelve.compareTo(eleven)); //SHOULD positive
        System.out.println("ten compareTo twelve?" + ten.compareTo(twelve)); //SHOULD 0
        System.out.println("eight compareTo o?" + eight.compareTo(o)); //SHOULD THROW EXCEPTION
        
      }
}