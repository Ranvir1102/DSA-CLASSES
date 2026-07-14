/**Question 2: Search in Rotated Sorted Array 
There is an integer array nums sorted in ascending order (with distinct values). 
Before being passed to your function, nums is possibly rotated at an unknown pivot index. 
Given the array nums after the possible rotation and an integer target, return the index of target if it 
exists in nums, otherwise return -1. 
Examples 
Example 1 
Input: nums = [4,5,6,7,0,1,2], target = 0 
Output: 4 
Example 2 
Input: nums = [4,5,6,7,0,1,2], target = 3 
Output: -1 
Example 3 
Input: nums = [1], target = 0 
Output: -1  */


package DSAQ;

public class SearchRotatedArray {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies in the left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }
                // Target lies in the right half
                else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in the right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                // Target lies in the left half
                else {
                    right = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums1, 0)); // 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums2, 3)); // -1

        int[] nums3 = {1};
        System.out.println(search(nums3, 0)); // -1
    }
}
