/**3. Parking Slot Search (Linear Search) 
Scenario: 
A security guard wants to know whether a car is parked in a parking area. He checks each parking 
slot one by one. 

Task: 
Store occupied parking slot numbers in an array and search for a specific slot number. */

package PracticeQuestions02;
import java.util.*;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Parking Slots : ");
        int n = sc.nextInt();
        int slot[] = new int[n];
        int num = 1;
        boolean check = false;
        // Loop For Storing The Occupied Parking Slot Number.
        for(int i = 0;i<n;i++){
            System.out.print("Enter The Occupied Parking Slot Number "+num+ " : ");
            num++;
            slot[i] = sc.nextInt();
        }
        System.out.print("Enter The Parking Slot Number To Be Checked : ");
        int key = sc.nextInt();
        // Linear Search Algo
        for(int i = 0;i<n;i++){
            if(slot[i]==key){
                check = true;
                System.out.print(+key+" Number Parking Slot Is Occupied");
                break;
            }
        }
        if(check==false){
            System.out.print(+key+" Number Parking Slot Is Not Occupied");
        }
        sc.close();
    }
}
