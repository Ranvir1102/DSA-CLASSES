package Day11;

public class pairsOfArray {
    public static void main(String[] args){
        int nums[] = {10,20,30,40,50,60};
        int total = 0;
        for(int i =0 ; i<nums.length;i++){
            int curr = nums[i];
            for(int j = i+1;j<nums.length;j++){
                total++;
                System.out.print("( "+curr+","+nums[j]+" )");
            }
             System.out.println();
             
        }
         System.out.print("Total Numbers Of Pairs Are :  "+total);
    }
}
