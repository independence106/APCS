/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

public class BigDiff {
    public static int bigDiff(int[] nums) {
        int min = -1;
        int max = 0;
        for (int i : nums) {
            if (min == -1) {
              min = i;
              max = i;
            } else {
              min = Math.min(i, min);
              max = Math.max(i, max);
            }       
        }
        return max - min;
    }
    public static void main(String[] args) {
        System.out.println(bigDiff([10, 3, 5, 6])); //7
        System.out.println(bigDiff([7, 2, 10, 9])); //8
        System.out.println(bigDiff([2, 10, 7, 2])); //8
    }
}
