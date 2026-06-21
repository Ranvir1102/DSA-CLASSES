/**
 * 10. Online Shopping Product Search (Binary Search) 
 * 
Scenario: 
An e-commerce company stores product IDs in sorted order to search products faster. 
Task: 

Search a product ID using Binary Search.
 */
package PracticeQuestions02;
import java.util.*;
public class Question10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number Of ProductIDs To Be Stored : ");
    int n = sc.nextInt();
    int productID[] = new int[n];
    int num = 1;
    boolean check = false;
    // loop for storing product ids
    for(int i = 0;i<n;i++){
        System.out.print("Enter The ProductID for Product "+num+" : ");
        num++;
        productID[i] = sc.nextInt();
    }
    Arrays.sort(productID);
    System.out.print("Enter The ProductID To Be Checked : ");
    int key = sc.nextInt();
    // binary search

    int start = 0;
    int end = n - 1;
    while(start<=end){
        int mid = (start+end)/2;
        if(productID[mid]==key){
            check = true;
            System.out.print("ProductId Found At Index : "+mid);
            break;
        }
        else if(key<productID[mid]){
            // goto left
            end = mid - 1; 
        }
        else{
            // goto right
            start = mid + 1;
        }
    }
    if(check==false){
        System.out.print("ProductID Not Found");
    }
    sc.close();
    }
}
