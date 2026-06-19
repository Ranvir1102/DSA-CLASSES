// correct code now
// In the classroom of the n students
// teacher dist. random number of chocolates
// to all the students 
// badmas bablu stole and eat the chocolate
// from 3 Students having most number of choco..
// How many choco.. Bublu eat
package Day11;

import java.util.Arrays;

public class babluChocolates {

    public static void main(String[] args) {
        // int numsChoco[] = { 5, 3, 7, 8, 9, 1, 15, 4 };
        // int numsChoco[] = { 1, 3, 4, 5, 7, 8, 9, 15 };

        // int l = numsChoco.length;
        // System.out.println("Stole Chocolate :" + (numsChoco[l - 1] + numsChoco[l - 2]
        // + numsChoco[l - 3]));

        int numsChoco[] = { 5, 3, 7, 8, 9, 1, 15, 4 };
        int l = numsChoco.length;

        Arrays.sort(numsChoco);

        System.out.println("Stole Chocolate :" + (numsChoco[l - 1] + numsChoco[l - 2]
                + numsChoco[l - 3]));

        int nums[] = {2,5,8,9,1,3,4};
        int L = nums.length;
        
        Arrays.sort(nums);

        System.out.println("Total : "+(nums[L-1]  + nums[L-2] + nums[L-3]));

    }

}
