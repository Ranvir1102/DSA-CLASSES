/**Question 4: Trapping Rain Water 
Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining. 
Examples 
Example 1 
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1] 
Output: 6 
Example 2 
Input: height = [4,2,0,3,2,5] 
Output: 9  */

package DSAQ;

public class TrappingRainWater {

    public static int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }

                left++;
            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {

        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height1)); // 6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2)); // 9
    }
}
