/**3.Employee Salary Verification 
Scenario: 
A company stores salaries of employees in an array. 

Task: 
• Store salaries of 10 employees.  
• Search for a salary entered by HR.  
• Display its position if found.  

Concept: 
Linear Search 
Array Index */
package Practicequestions;
import java.util.*;
public class Question8 {
    public static void main(String[] args){
        int salaries[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i =0 ; i<salaries.length;i++){
            System.out.print("Enter The Salary Of Employee "+num+" : ");
            num++;
            salaries[i] = sc.nextInt();
        }
        
        System.out.print("Employee Salaries Are : ");
        for(int i = 0;i<salaries.length;i++){
            System.out.print(" "+salaries[i]+" ");
        }
        System.out.println();
        System.out.print("Enter The Salary To Be Checked : ");
        int checkSalary = sc.nextInt();
        boolean check = false;
        for(int i = 0;i<salaries.length;i++){
            if(salaries[i]==checkSalary){
                check = true;
                System.out.println("Salary Is Found At Index : "+i);
            }
        }
        if(check==false){
            System.out.println("!Salary Not Found!");
        }
        sc.close();

    }
}
