public class Looper {
  public static void populateArrayWithRandom(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (Math.random() < 0.5) ? (int) (Math.random() * 100) : (int) (Math.random() * 100 * -1);
    }
  }
  public static String arrayToString(int[] array) {
    String stringThing = "";
    for (int i = 0; i < array.length; i++) {
        stringThing += array[i] + " ";
    }
    return stringThing;
  }
  public static int linSearch(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      if (target == array[i]) {
        return i;
      }
    }
    return -1;
  }
  public static int linSearchR(int[] a, int target) {

  }
  public static void main(String[] args) {
      int[] array = new int[5];
      populateArrayWithRandom(array);
  }

}
