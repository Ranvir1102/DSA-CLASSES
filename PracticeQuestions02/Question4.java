/**
 * 4. Contact Search in Old Mobile Phone (Linear Search) 
Scenario: 
In an old mobile phone, contacts are searched one by one until the desired contact is found. 

Task: 
Store 20 contact numbers and search for a particular contact number. 

 */
package PracticeQuestions02;
import java.util.*;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contact[] = new int[20];
        int num = 1;
        int l = contact.length;
        boolean check = false;
        // Loop For Storing The Contact Number.
        for(int i = 0;i<l;i++){
            System.out.print("Enter The Contact Number Of Person  "+num+ " : ");
            num++;
            contact[i] = sc.nextInt();
        }
        System.out.print("Enter The Contact Number To Be Checked : ");
        int key = sc.nextInt();
        // Linear Search Algo
        for(int i = 0;i<l;i++){
            if(contact[i]==key){
                check = true;
                System.out.print("Contact Number Is Found");
                break;
            }
        }
        if(check==false){
            System.out.print("Contact Number Is Not Found");
        }
        sc.close();
    }
}
    
