/**Problem 4: 
 * 
 * Online Shopping Orders 
An e-commerce company stores daily orders received in a week. 

Task: 
1. Store 7 days orders in an array.  
2. Find total orders.  
3. Find maximum orders in a day.  
4. Count days where orders were more than 100. 

Sample Input: 
80 120 95 140 110 75 130 
Expected Output: 
Total Orders = 750 
Maximum Orders = 140 
Days Above 100 Orders = 4*/

package Practicequestions;
import java.util.*;

public class Question4 {

    public static int totalOrder(int orders[]){
        int totalorder = 0;
        for(int i = 0;i<7;i++){
            totalorder += orders[i];
        }
        return totalorder;
    }

    public static int maximumOrder(int orders[]){

        int max = orders[0];
        for(int i =0;i<7;i++){
            if(orders[i]>max){
                max = orders[i];
            }
        }
        return max;
    }

    public static int hundredcount(int orders[]){

        int hundredCount = 0;
        for(int i = 0;i<7;i++){
            if(orders[i]>100){
                hundredCount++;
            }
        }
        return hundredCount;
    }
    public static void main(){
        int orders[] = new int[7];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i = 0 ;i<7 ; i++){
            System.out.print("Enter The Number Of Orders Received On Day  "+num+" : ");
            num++;
            orders[i]=sc.nextInt();
        }
        System.out.print("Array Is : ");
        for(int i = 0 ; i<7 ; i++){
            System.out.print(" "+orders[i]+" ");
        }
        System.out.println();
        System.out.println("TotalOrders In The Week Are : "+(totalOrder(orders)));
        System.out.println("Maximum Order Received Is : "+(maximumOrder(orders)));
        System.out.println("Number Of Days When Order Where Above 100 Are : "+(hundredcount(orders)));
        sc.close();
    } 
}
