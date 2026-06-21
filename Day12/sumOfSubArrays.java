package Day12;

public class sumOfSubArrays {
    public static void main(String[] args){
        int nums[] = {2,5,4,8,6,3,4};
        int l = nums.length;
        int count = 0;
        

        // Outer Loop
        for(int i = 0;i<l;i++){
            int start = i;
        // Inner Loop
             for(int j = start;j<l;j++){
                int end = j;
                int add = 0;
                // Print SubArrays
                for(int k = start;k<=end;k++){
                    
                    add += nums[k];
                    count++;
                    
            
 
                }

                System.out.println();
                System.out.print("Sum-Of-Sub-Array : "+add);
                
             }
             System.out.println();    
        }
        
        System.out.println();
        
    }
    
}

    

