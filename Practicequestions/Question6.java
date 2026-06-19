/**1.Online Shopping Price Analysis 
Scenario: 

An e-commerce website stores the prices of products in an array. 

Task: 
• Store prices of 10 products.  
• Find:  
o Most expensive product price.  
o Cheapest product price. 


Concept: 
Array Traversal 
Min & Max*/


package Practicequestions;
import java.util.*;
public class Question6 {
    public static int Expensive(int prices[]){
        int expensive = Integer.MIN_VALUE;
        for(int i = 0 ; i<prices.length;i++){
            if(expensive<prices[i]){
                expensive = prices[i];
            }
        }
        return expensive;
    }
    public static int Cheapest(int prices[]){
        int cheapest = Integer.MAX_VALUE;
        for(int i = 0 ; i<prices.length;i++){
            if(cheapest>prices[i]){
                cheapest = prices[i];
            }
        }
        return cheapest;
    }
    public static void main(String[] args){
        int prices[] = new int[10];
    Scanner sc = new Scanner(System.in);
    int num = 1;
    for(int i = 0;i<prices.length;i++){
        System.out.print("Enter The Price Of Product "+num+" : ");
        num++;
        prices[i] = sc.nextInt();   
    }
    System.out.print("Prices Of Products Are : ");
        for(int i = 0;i<prices.length;i++){
            System.out.print(" "+prices[i]+" ");
        }
    System.out.println();
    System.out.println("Most Expensive Product Price Is : "+Expensive(prices));
    System.out.println("Most Cheapest Product Price Is : "+Cheapest(prices));
    sc.close();
    }
}
