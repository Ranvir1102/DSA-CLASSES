
/**Problem 5: Cricket Score Analyzer 
A batsman played 10 matches. 

Task: 
1. Store runs scored in each match.  
2. Calculate total runs.  
3. Calculate average runs.  
4. Find highest score.  
5. Count how many times the player scored 50 or more runs.  
Sample Input: 

45 67 23 89 12 56 78 34 90 51 
Expected Output: 
Total Runs = 545 
Average Runs = 54.5 
Highest Score = 90 
50+ Scores = 6*/

package Practicequestions;
import java.util.*;
public class Question5 {
    public static int totalRuns(int score[]){
        int totalruns = 0;
        for(int i = 0; i<score.length;i++){
            totalruns += score[i];
        }
        return totalruns;
    }
    public static double averageRuns(int score[]){
        double averageruns = (double) totalRuns(score)/10;
        return averageruns;
    }
    public static int highestRuns(int score[]){
        int highest = Integer.MIN_VALUE;
        for(int i = 0;i<score.length;i++){
            if(highest < score[i]){
                highest = score[i];
            }
        }
        return highest;
    }
    public static int count50(int score[]){
        int count = 0;
        for(int i = 0;i<score.length;i++){
            if(score[i]>=50){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){

        int score[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i = 0;i<score.length;i++){
            System.out.print("Enter The Runs Scored By The Batman In His " +num+ " Match : ");
            num++;
            score[i] = sc.nextInt();
        }
        System.out.print("Score Of Batsman In 10 Matches : ");
        for(int i = 0;i<score.length;i++){
            System.out.print(" "+score[i]+" ");
        }
        System.out.println();
        System.out.println("Total Runs Scored By The Batsman In 10 Matches Are : "+totalRuns(score));
        System.out.println("Average Runs Scored By The Batsman In 10 Matches Are : "+averageRuns(score));
        System.out.println("Highest Runs Scored By The Batsman In 10 Matches Are : "+highestRuns(score));
        System.out.println("Number Of Times Batsman Scored 50 OR More Than 50 In The 10 Matches Is  : "+count50(score));
        sc.close();
    }
}
