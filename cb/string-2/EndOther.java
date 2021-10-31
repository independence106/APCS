public class EndOther {
  /**
   * Given two strings, return true if either of the strings appears at the
   * very end of the other string, ignoring upper/lower case differences (in
   * other words, the computation should not be "case sensitive"). Note:
   * str.toLowerCase() returns the lowercase version of a string.
   */
  public static boolean endOther(String a, String b) {
    String newa = a.toLowerCase();
    String newb = b.toLowerCase();
    

    return (a.length() < b.length()) ? (newa.equals(newb.substring(b.length() - a.length()))): (newb.equals(newa.substring(a.length()-b.length())));

  }
  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc")); // true
    System.out.println(endOther("AbC", "HiaBc")); // true
    System.out.println(endOther("abc", "abXabc")); // true
  }

}
