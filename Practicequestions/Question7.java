/**2. Cricket Score Search 
Scenario: 
A cricket coach stores players' scores in an array and wants to know whether a player scored 
a specific number of runs. 

Task: 
• Store scores of 11 players.  
• Ask the user for a score.  
• Use Linear Search to check whether any player made that score. 

Concept: 
Linear Search 
 */
package Practicequestions;
import java.util.*;
public class Question7 {
    public static void main(String[] args){

    int playerScores[] = new int[11];
    Scanner sc = new Scanner(System.in);
    int num = 1;
    System.out.println("--------------");
    for(int i = 0;i<playerScores.length;i++){
        System.out.print("Score Of Player "+num+" : ");
        num++;
        playerScores[i] = sc.nextInt();
        }
    System.out.println("--------------");    
    System.out.print("PlayerScores Are : ");
    for(int i = 0;i<playerScores.length;i++){
        System.out.print(" "+playerScores[i]+" ");
    }
    System.out.println();
    System.out.print("Enter the Score To Be Checked : ");
    int checkScore = sc.nextInt();
    boolean check = false;
    
    for(int i = 0;i<playerScores.length;i++){
        if(playerScores[i]==checkScore){
            check = true;
            System.out.println("Player Has Scored This Run");
        }
    }
    if(check==false){
        System.out.println("Player Has Not Scored This Run");
       }
       sc.close();;
    }
}
