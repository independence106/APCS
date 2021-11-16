public class RotateLeft3 {
  public static int[] rotateLeft3(int[] nums) {
    int first = nums[0];
    nums[0] = nums[2];
    nums[2] = nums[1];
    nums[1] = first;
    return nums;
  }
}
