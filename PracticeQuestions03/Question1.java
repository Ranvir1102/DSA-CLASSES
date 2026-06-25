/**
 * Question 1: Netflix Binge Watch Analysis (Sub Array) 
Scenario: 
Netflix wants to know how many episodes a user watches continuously during a binge 
session. 

Task: 
Store the watch time (in minutes) for 7 episodes in an array. 
Generate and display all possible continuous watch sessions (subarrays). 

Example: 
Watch Time = {30, 40, 25} 
Subarrays: 
{30} 
{30,40} 
{30,40,25} 
{40} 
{40,25}
 */
package PracticeQuestions03;
import java.util.*;
public class Question1 {
    public static void main(String[] args){
        // int n = 7;
        int watchTime[] = new int[7];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        // loop for storing watchtime in an array.
        for(int i = 0;i<7;i++){
            System.out.print("Enter The Watch Time For Episode "+num+" : ");
            num++;
            watchTime[i] = sc.nextInt();
        }
        // code for printing subarrays.
        for(int i = 0;i<7;i++){
            int start = i;
            for(int j = start ; j<7;j++){
                int end = j;
                System.out.print("[ ");
                for(int k = start;k<=end;k++){
                    // System.out.print("[");
                    System.out.print(watchTime[k]+" ");
                    // System.out.print("]");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}


