/**
 * Question 2: Weekly Sales Report (Max & Min) 
Scenario: 
A shop owner stores daily sales for a week. 

Find: 
• Highest Sale  
• Lowest Sale  
• Difference between highest and lowest sale
 */
package PracticeQuestions03;
import java.util.*;
public class Question2 {
    public static int highestSale(int sales[]){
        int high = Integer.MIN_VALUE;
        for(int i = 0;i<sales.length;i++){
            if(high<sales[i]){
                high = sales[i];
            }
        }
        return high;
    }
    public static int lowestSale(int sales[]){
        int low = Integer.MAX_VALUE;
        for(int i = 0;i<sales.length;i++){
            if(low>sales[i]){
                low = sales[i];
            }
        }
        return low;
    }
    public static int differ(int sales[]){
        int Difference = highestSale(sales) - lowestSale(sales);
        return Difference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Days For Which Sales To Be Stored : ");
        int n = sc.nextInt();
        int sales[] = new int[n];
        int num = 1;
        // Loop for storing sales per day
        for(int i = 0; i<n;i++){
            System.out.print("Enter The Sales For Day "+num+" : ");
            num++;
            sales[i] = sc.nextInt();
        }
        System.out.println("Highest Sale Of The Week Is : "+highestSale(sales));
        System.out.println("Lowest Sale Of The Week Is : "+lowestSale(sales));
        System.out.print("Difference Between Highestsale And Lowestsale Is : "+differ(sales));
        sc.close();
    }
}
