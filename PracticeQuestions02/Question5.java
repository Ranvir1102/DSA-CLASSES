/**
 * 5. IPL Player Jersey Search (Linear Search) 
Scenario: 
A coach wants to check whether a jersey number belongs to a player in the team. 

Task: 
Store jersey numbers and search for a specific jersey number. 
 */
package PracticeQuestions02;
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Jersey Numbers To Be Stored : ");
        int n = sc.nextInt();
        int jersey[] = new int[n];
        int num = 1;
        boolean check = false;
        // Loop For Storing Jersey Numbers In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The Jersey Number Of Player "+num+" : ");
            num++;
            jersey[i] = sc.nextInt();
        }
        System.out.print("Enter The Jersey Number To Be Checked : ");
        int key = sc.nextInt();
        // Linear Search Algo
        for(int i = 0 ; i < n ; i++){
            if(jersey[i]==key){
                check = true;
                System.out.print("Jersey Number Found");
                break;
            }
        }
        if(check==false){
            System.out.print("Jersey Number Not Found");
        }
        sc.close();
    }
}
