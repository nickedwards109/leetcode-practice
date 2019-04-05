// solution in O(n) time
// O(n) space
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // use the Map interface to make a HashMap instance for holding an integer key and an integer value
        Map<Integer, Integer> map = new HashMap<>();
        
        // fill the HashMap with each element and its index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        // find each element's complement.
        // if the complement exists in the HashMap,
        // and if this complement isn't the original number itself
        //   return a new array containing the index of the number and the index of its complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No solution to two sum problem");
    }
}
