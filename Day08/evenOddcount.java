package Day08;

import java.util.*;

public class evenOddcount {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int num = 1;

        int marks[] = new int[n];
        for(int i =0;i<n;i++){

            System.out.print("Enter your"+num+"Score:");
            num++;
            marks[i] = sc.nextInt(); 

            
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i<n;i++){

            if(marks[i] %2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        System.out.println("EvenCount : "+evenCount);
        System.out.println("OddCount : "+oddCount);

        sc.close();



    }
    
}
