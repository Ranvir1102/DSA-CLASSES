/**
 * 9. Train Seat Verification (Binary Search) 
Scenario: 
Railway seat numbers are stored in sorted order. The reservation system quickly checks whether a 
seat exists. 

Task: 
Store seat numbers in sorted order and search for a seat number using Binary Search.
 */
package PracticeQuestions02;
import java.util.*;
public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of SeatIDs To Be Stored : ");
        int n = sc.nextInt();
        int Seat_Num[] = new int[n];
        int num = 1;
        boolean found = false;
        // Loop For Storing SeatID In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The SeatID For Seat "+num+" : ");
            num++;
            Seat_Num[i] = sc.nextInt();
        }
        Arrays.sort(Seat_Num);
        System.out.print("Enter The SeatID To Be Checked : ");
        int key = sc.nextInt();
        // Binary Search Algo

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(Seat_Num[mid]==key){
                System.out.print("Seat Found At Index : "+mid);
                found = true;
                break;
            }
            else if(key<Seat_Num[mid]){
                // go to left
                end = mid - 1;
            }
            else {
                // go to right
                start = mid + 1;
            }
        }
        
        if(found == false){
            System.out.print("Seat Not Found");
        }
        sc.close();
    }
}
