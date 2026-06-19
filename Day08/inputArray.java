package Day08;

import java.util.*;

public class inputArray{

    public static void main(String[] args){

        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks of the given subjects: physics , math and english");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // access the array

        System.out.println("physics marks : "+marks[0]);
        System.out.println("math marks : "+marks[1]);
        System.out.println("english marks : "+marks[2]);

        sc.close();
    }
}