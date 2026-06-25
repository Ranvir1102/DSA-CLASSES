/**
 * Question 4: Stock Market Analysis (Sub Array Challenge) 
Scenario: 
Daily profits are stored in an array. 

Task: 
Generate all possible subarrays and calculate: 
• Total number of subarrays.  
• Largest subarray length.
 */

package PracticeQuestions03;
import java.util.*;
public class Question4 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number Of Days For Which Profit Is To Be Stored : ");
    int n = sc.nextInt();
    int profit[] = new int[n];
    int num = 1;
    int count = 0;
    // loop for storing daily profit
    for(int i = 0 ;  i < n ; i++){
      System.out.print("Enter The Profit Of Day "+num+" : ");
      num++;
      profit[i] = sc.nextInt();
    }

    // loop for genrating subarrays

     for(int i = 0;i<n;i++){
            int start = i;
            for(int j = start ; j<n;j++){
                int end = j;
                System.out.print("[ ");
                for(int k = start;k<=end;k++){
                    // System.out.print("[");
                    System.out.print(profit[k]+" ");
                    // System.out.print("]");
                    count++;
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Number Of SubArrays : "+count);
    
  }
}
