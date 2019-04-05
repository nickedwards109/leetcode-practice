// brute force solution to two-sum
// O(n^2) time complexity
// O91) space complexity
class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] sumIndices = new int[2];
      for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
              if (target - nums[j] == nums[i]) {
                  sumIndices[0] = i;
                  sumIndices[1] = j;
                  System.out.print(sumIndices[1]);
              }
          }
      }
    return sumIndices;
    }
}
