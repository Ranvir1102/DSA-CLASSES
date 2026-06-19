package Day01;

import java.util.*;

public class sumOfnumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        

        int choice;
        int evenNum = 0;
        int oddNum = 0;

        do{
            System.out.println("Enter Your Number : ");
            int n = sc.nextInt();
            if(n % 2 == 0)
            {
                evenNum += n;
            }
            else{
                oddNum += n;
            }
            System.out.println("Do You Want To Continue If Yes Press : 1 , OtherWise : 0");
             choice = sc.nextInt();

        }while(choice==1);

        System.out.println("Sum Of Even Number : "+(evenNum));
        System.out.println("Sum Of Odd Number : "+(oddNum));
        System.out.println("Sum Of All The  Numbers : "+(evenNum + oddNum));

        sc.close();
    }

    
}
