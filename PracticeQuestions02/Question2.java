/**
 * 2. School Attendance Verification (Linear Search) 
Scenario: 
A teacher has a list of students present today. She checks the attendance sheet one by one to see if 
a student is present. 

Task: 
Store roll numbers in an array and search for a particular roll number using Linear Search.
 */
package PracticeQuestions02;
import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Students Present Today : ");
        int n = sc.nextInt();
        int present[] = new int[n];
        int num = 1;
        boolean check = false;
        // Loop For Storing The Students Roll Number Who Are Present.
        for(int i = 0;i<n;i++){
            System.out.print("Enter The Roll_Number Of Student "+num+" : ");
            num++;
            present[i] = sc.nextInt();
        }
        System.out.print("Enter The Roll_Number To Be Checked : ");
        int key = sc.nextInt();
        // Linear Search Algo
        for(int i = 0;i<n;i++){
            if(present[i]==key){
                check = true;
                System.out.print(+key+" Roll Number Is Present");
                break;
            }
        }
        if(check==false){
            System.out.print(+key+" Roll Number Is Absent");
        }
        sc.close();
    }
}
