/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/

public class Sum3 {
  public static int sum3(int[] nums) {
    int ans = 0;
    for (int e: nums) {
      ans += e;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(sum3([1, 2, 3])); //6
    System.out.println(sum3([5, 11, 2])); //18
    System.out.println(sum3([7, 0, 0])); //7
  }
}
