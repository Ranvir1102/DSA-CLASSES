/**
 * 6. Dictionary Word Search (Binary Search) 
Scenario: 
When you search a word in a dictionary, you don't start from page 1. You open somewhere in the 
middle and keep reducing the search area. 

Task: 
Store sorted word IDs and search for a word ID using Binary Search.
 */
package PracticeQuestions02;
import java.util.*;
public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of WordIDs To Be Stored : ");
        int n = sc.nextInt();
        int wordID[] = new int[n];
        int num = 1;
        // Loop For Storing WordID In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The WordID For Word "+num+" : ");
            num++;
            wordID[i] = sc.nextInt();
        }
        System.out.print("Enter The WordID To Be Checked : ");
        int key = sc.nextInt();
        // Binary Search Algo

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(wordID[mid]==key){
                System.out.print("Word Found At Index : "+mid);
                break;
            }
            else if(key<wordID[mid]){
                // go to left
                end = mid - 1;
            }
            else {
                // go to right
                start = mid + 1;
            }
        }
        sc.close();
    }
}
