/**
 * Problem 3: Classroom Attendance System 
A teacher stores attendance of students. 
1 = Present 
0 = Absent 
Task: 
1. Take attendance of 20 students.  
2. Count total present students.  
3. Count total absent students.  
4. Calculate attendance percentage.  

Sample Input: 
1 1 0 1 1 0 1 1 1 0 
Expected Output: 
Present Students = 7 
Absent Students = 3 
Attendance Percentage = 70%
 */

package Practicequestions;
import java.util.*;

public class Question3 {

    public static int totalPresent(int attendance[]){
        int presentcount = 0;
        for(int i =0;i<20;i++){
            if(attendance[i]==1){
                presentcount++;
            }
        }
        return presentcount;
    }

    public static int totalAbsent(int attendance[]){
        int absentcount = 0;
        for(int i =0;i<20;i++){
            if(attendance[i]==0){
                absentcount++;
            }
        }
        return absentcount;
    }

    // ATTENDANCE PERCENTAGE

    public static double percentage(int attendance[]){

        double Percent =   (double) totalPresent(attendance)/20*100;
        return Percent;        
            

    }

    public static void main(String[] args){

        int attendance[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i = 0;i<20;i++){
            System.out.print("Enter 1 If Student "+num+" Is Present Otherwise O : ");
            num++;
            attendance[i] = sc.nextInt();

        }

        System.out.println("Total Number Of Students Present Are : "+totalPresent(attendance));
        System.out.println("Total Number Of Students Absent Are : "+totalAbsent(attendance));
        System.out.println("Attendance Percentage : "+percentage(attendance)+"%");
        sc.close();

    }
    
}
