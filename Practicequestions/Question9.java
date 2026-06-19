/**4. Temperature Monitoring System 
Scenario: 
A weather station stores temperatures recorded for 7 days. 

Task: 
• Store temperatures in an array.  
• Find:  
o Highest temperature.  
o Lowest temperature.  
o Difference between highest and lowest.  

Concept: 
Min & Max */
package Practicequestions;
import java.util.*;
public class Question9 {
    public static int highestTemp(int temperature[]){
        int high = Integer.MIN_VALUE;
        for(int i =0 ; i<temperature.length;i++){
            if(high<temperature[i]){
                high = temperature[i];
            }
        }
        return high;
    }
    public static int lowestTemp(int temperature[]){
        int low = Integer.MAX_VALUE;
        for(int i =0 ; i<temperature.length;i++){
            if(low>temperature[i]){
                low = temperature[i];
            }
        }
        return low;
    }
    public static int tempDiffer(int tempDiffer[]){
        int Differ =  highestTemp(tempDiffer) - lowestTemp(tempDiffer);
        return Differ;
    }
    public static void main(String[] args){
        int temperature[] = new int[7];
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i = 0 ; i<temperature.length;i++){
            System.out.print("Enter The Temprature OF Day "+num+" : ");
            num++;
            temperature[i] = sc.nextInt();
        }
        System.out.print("Temprature Of 7 Days Are : ");
        for(int i = 0;i<temperature.length;i++){
            System.out.print(" "+temperature[i]+" ");
        }
        System.out.println();
        System.out.println("Highest Temperature Is : "+(highestTemp(temperature))+" Degree celcius");
        System.out.println("Lowest Temperature Is : "+(lowestTemp(temperature))+" Degree celcius");
        System.out.println("Temprature Difference Is : "+(tempDiffer(temperature)));
        sc.close();
    }
}
