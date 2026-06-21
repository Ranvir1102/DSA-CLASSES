/**
 * 1. Netflix Movie Search (Linear Search) 
Scenario: 
You open Netflix and want to find a movie in your "Watch Later" list. The app checks each movie one 
by one until it finds the movie. 

Task: 
Store movie IDs in an array and search for a specific movie ID using Linear Search. 

Question: 
Write a Java program to check whether the movie ID entered by the user exists in the watchlist.
 */
package PracticeQuestions02;
import java.util.*;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of MovieID To Be Stored : ");
        int n = sc.nextInt();
        int movieID[] = new int[n];
        int num = 1;
        boolean check = false;
        // Loop For Storing MovieID In An Array.
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter The MovieID "+num+" : ");
            num++;
            movieID[i] = sc.nextInt();
        }
        System.out.print("Enter The MovieID To Be Checked : ");
        int key = sc.nextInt();
        // Linear Search Algo
        for(int i = 0 ; i < n ; i++){
            if(movieID[i]==key){
                check = true;
                System.out.print("MovieID Found");
                break;
            }
        }
        if(check==false){
            System.out.print("MovieID Not Found");
        }
        sc.close();
    }
}
