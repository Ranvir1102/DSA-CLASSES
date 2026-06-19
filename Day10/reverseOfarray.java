package Day10;
public class reverseOfarray {
    public static void main(String[] args){
        int nums[] = {10,20,30,40,50};
        int first = 0;
        int last = nums.length-1;
        while(first<last){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
