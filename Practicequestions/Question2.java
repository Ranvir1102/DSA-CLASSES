/**
 * Problem 2: Weekly Expense Tracker 
A person records his expenses for 7 days. 

Task: 
1. Store daily expenses in an array.  
2. Calculate total weekly expense.  
3. Find the day with the highest expense.  
4. Find the day with the lowest expense. 


Sample Input: 
500 700 300 900 400 800 600 
Expected Output: 
Total Expense = 4200 
Highest Expense = 900 
Lowest Expense = 300 

 */



package Practicequestions;
import java.util.*;
public class Question2 {

    // FUNCTION FOR TOTAL WEEKLY EXPENSE
    public static int totalExpense(int expenses[]){
        int total = 0;
        for(int i = 0;i<7;i++){
            total += expenses[i];
        }
        return total;
    }

    // FUNCTION FOR DAY WITH THE HIGHEST EXPENSE
    public static int highestExpenseDay(int expenses[]){
        int highestExpense = expenses[0];
        int highestDay = 1;
        for(int i = 0;i<7;i++){
            if(highestExpense<expenses[i]){
                highestExpense = expenses[i];
                 highestDay = i + 1;  // CHATGPT
            }
        }
        return highestDay;
    }

    // FUNCTION FOR DAY WITH THE LOWEST EXPENSE
    public static int lowestExpenseDay(int expenses[]){
        int lowestExpense = expenses[0];
        int lowestDay = 1;

        for(int i = 0;i<7;i++){
            if(lowestExpense>expenses[i]){
                lowestExpense = expenses[i];
                 lowestDay = i + 1;  // CHATGPT

            }
        }
        return lowestDay;
    }

    public static void main(String[] args){
        int num = 1;
        int expenses[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<7;i++){
            System.out.print("Enter Your Expense Of Day " +num+ " : ");
            num++;
            expenses[i] = sc.nextInt();
        }

        System.out.print("Daily Expenses Are : ");
        for(int i = 0;i<7;i++)
        {
            System.out.print(" "+expenses[i]+" ");
        }
        System.err.println();
        System.out.println("TotalWeekly Expense is : "+(totalExpense(expenses)));
        System.out.println("HighestExpense Day Is : "+(highestExpenseDay(expenses)));
        System.out.println("LowestExpense Day Is : "+(lowestExpenseDay(expenses)));
        sc.close();
    }

    

}
