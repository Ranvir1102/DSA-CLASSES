package Day12;

public class subArray {
    public static void main(String[] args){
        int nums[] = {2,3,4,5,6,7};
        int l = nums.length;
        int count = 0;
        // int add = 0;

        // Outer Loop
        for(int i = 0;i<l;i++){
            int start = i;
        // Inner Loop
             for(int j = start;j<l;j++){
                int end = j;
                // Print SubArrays
                for(int k = start;k<=end;k++){
                    System.out.print(nums[k] + " ");
                    // add += nums[k];
                    count++;
            
 
                }
                System.out.println();
             }
             System.out.println();    
        }
        System.out.print("Totalcount : "+count);
        System.out.println();
        // System.out.print("ADD : "+add);
    }
    
}
