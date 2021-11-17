/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int[] storage = new int[2];
        int min = nums[0];
        int max = nums[0];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                storage[0] = i;
            } 
            if (nums[i] >= max) {
                max = nums[i];
                storage[1] = i;
            }
        }
        nums[storage[0]] = 0;
        nums[storage[1]] = 0;
        for (int i : nums) {
          ans += i;
        }
        return ans / (nums.length - 2);
    }
    public static void main(String[] args) {
        System.out.println(centeredAverage([1, 2, 3, 4, 100])); //3
        System.out.println(centeredAverage([1, 1, 5, 5, 10, 8, 7])); //5
        System.out.println(centeredAverage([-10, -4, -2, -4, -2, 0])); //-3
    }
}
