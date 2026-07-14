/**Question 5:  3Sum 
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that: 
• i ≠ j  
• i ≠ k  
• j ≠ k  
• nums[i] + nums[j] + nums[k] = 0  
The solution set must not contain duplicate triplets. 
Examples 
Example 1 
Input: nums = [-1,0,1,2,-1,-4] 
Output: [[-1,-1,2],[-1,0,1]] */

package DSAQ;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer = threeSum(nums);

        System.out.println(answer);
    }
}