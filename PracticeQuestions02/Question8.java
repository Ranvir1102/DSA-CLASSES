/**
 * 8. Searching a Student Result (Binary Search) 
Scenario: 
A school stores student IDs in sorted order. To find a student's result quickly, the system uses Binary 
Search. 

Task: 
Search a student ID in a sorted array.
 */
package PracticeQuestions02;
import java.util.*;
public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of StudentIDs To Be Stored : ");
        int n = sc.nextInt();
        int StudentID[] = new int[n];
        int num = 1;
        boolean found = false;
        // Loop For Storing StudentID In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The StudentID For Student "+num+" : ");
            num++;
            StudentID[i] = sc.nextInt();
        }
        System.out.print("Enter The StudentID To Be Checked : ");
        int key = sc.nextInt();
        // Binary Search Algo

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(StudentID[mid]==key){
                System.out.print("Result Found");
                found = true;
                break;
            }
            else if(key<StudentID[mid]){
                // go to left
                end = mid - 1;
            }
            else {
                // go to right
                start = mid + 1;
            }
        }
        
        if(found == false){
            System.out.print("Result Not Found");
        }
        sc.close();
    }
}
