public class CountHi {
  /**
   * Return the number of times that the string "hi" appears anywhere in the
   * given string.
   */
  public static int countHi(String str) {
    int counter = 0;
    for (int i = 0; i < (str.length() - 1); i++) {
      if (str.substring(i, i + 2).equals("hi")) {
        counter++;
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    System.out.println(countHi("abc hi ho")); // 1
    System.out.println(countHi("ABChi hi")); // 2
    System.out.println(countHi("hihi")); // 2
}
}
