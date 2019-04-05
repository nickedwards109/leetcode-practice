/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// brute force
// loop through the array
// in each one of these loops, loop through the array starting at the next number
// if the two numbers sum to the target, return an array containing the indices
var twoSum = function(nums, target) {
    for (i = 0; i < nums.length; i++) {
      for (j = i + 1; j < nums.length; j++) {
          if (target - nums[j] == nums[i]) {
              return [i, j];
          }
      }
    }
};
