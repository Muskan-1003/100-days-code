/* Running Sum of 1d Array
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
public class Day2 {
  public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4};
      int[] results = runningArray(nums);
      for (int i = 0; i < results.length; i++) {
          System.out.print(results[i] + " ");
      }
  }

  public static int[] runningArray(int[] nums) {
      int sum = 0;
      int[] newArr = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
          sum = sum + nums[i];
          newArr[i] = sum;
      }
      return newArr;
  }
}
