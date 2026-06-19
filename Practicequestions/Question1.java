/**Problem 1: Student Marks Management System 
A school wants to store marks of 10 students in an array.


Task: 
1. Take marks of 10 students as input.  
2. Find total marks.  
3. Find average marks.  
4. Find highest marks.  
5. Find lowest marks. 


Sample Input: 
78 65 90 88 45 67 92 76 81 55


Expected Output: 
Total Marks = 737 
Average Marks = 73.7 
Highest Marks = 92 
Lowest Marks = 45*/



package Practicequestions;

import java.util.*;

public class Question1{

    public static int totalMarks(int marks[]){
        int Total = 0;
        for(int i = 0; i<marks.length;i++){
         Total += marks[i];
        }
        return Total;

        
    }

    public static double averageMarks(int marks[]){
        double average = (double) totalMarks(marks) / marks.length;
        return average; 
    }

    public static int highestMarks(int marks[]){
        int highest = Integer.MIN_VALUE;
        for(int i = 0 ; i < marks.length; i++){
            if(highest<marks[i]){
                highest = marks[i];
            }
        }
        return highest;
    }
    public static int lowestMarks(int marks[]){
        int lowest = Integer.MAX_VALUE;
        for(int i = 0 ; i < marks.length; i++){
            if(lowest>marks[i]){
                lowest = marks[i];
            }
        }
        return lowest;
    }

   

    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Students  Whose Marks Are To Be Stored : ");
        int n = sc.nextInt();
        int num = 1;

        int  marks[] = new int[n];
        for(int i = 0;i<marks.length;i++){
            System.out.print("Enter the marks of  student "  +num+ " : ");
            num++;
            marks[i] = sc.nextInt();
        }
        System.out.print("Array Is : ");
        for(int i = 0;i<marks.length;i++)
        {
            System.out.print(" "+marks[i]+" ");
        }
        System.out.println();
        System.out.println("TotalMarks : "+(totalMarks(marks)));
        System.out.println("AverageMarks : "+(averageMarks(marks)));
        System.out.println("HighestMarks : "+(highestMarks(marks)));
        System.out.println("LowestMarks : "+(lowestMarks(marks)));
        sc.close();
    }
}