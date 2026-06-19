package Day07;

public class Butterfly {

    public static void printButterfly(int n){

        // 1st HALF OUTER LOOP

        // stars 1 to n
        for(int i = 1 ; i <= n ; i++){

            // stars
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            // spaces
            for(int j = 1;j<= 2*(n-i);j++){ 
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
    
        }

        // 2st HALF OUTER LOOP

        // stars n to 1
        for(int i = n ; i >= 1 ; i--){

            // stars
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            // spaces
            for(int j = 1;j<= 2*(n-i);j++){ 
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
    
        }

 

    }

    public static void main(String[] args){

        printButterfly(10);;

    }
    
}
