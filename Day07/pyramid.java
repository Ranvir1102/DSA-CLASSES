package Day07;

public class pyramid{  

    public static void invertedHalfpyramid(int n){ 
        // OUTER LOOP
        for(int i = 1; i <= n ; i++){ 
            // SPACES
            for(int j = 1 ; j <= n-i ; j++){ 
                System.out.print(" ");
            }
                // STARS
                for( int j = 1 ; j <= i ; j++){ 
                    System.out.print("*");
                }
                
                System.out.println();
        }
    }
            public static void main(String[] args){ 

        invertedHalfpyramid(5);
    }
}

    
    

