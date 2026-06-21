/**
 * 7. Finding a Book in a Library (Binary Search) 
Scenario: 
Books are arranged according to accession numbers. The librarian directly goes to the middle section 
and narrows the search. 

Task: 
Store sorted book IDs and search for a particular book ID using Binary Search.
 */
package PracticeQuestions02;
import java.util.*;
public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of BookIDs To Be Stored : ");
        int n = sc.nextInt();
        int BookID[] = new int[n];
        int num = 1;
        boolean found = false;
        // Loop For Storing BookID In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The BookID For Book "+num+" : ");
            num++;
            BookID[i] = sc.nextInt();
        }
        System.out.print("Enter The BookID To Be Checked : ");
        int key = sc.nextInt();
        // Binary Search Algo

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(BookID[mid]==key){
                System.out.print("Book Found At Index : "+mid);
                found = true;
                break;
            }
            else if(key<BookID[mid]){
                // go to left
                end = mid - 1;
            }
            else {
                // go to right
                start = mid + 1;
            }
        }
        
        if(found == false){
            System.out.print("Book Not Found");
        }
        sc.close();
    }
}

