package Day15;
import java.util.*;

public class keyPair {

  public static boolean checkPair(int nums[],int x){
    int n = nums.length;
    Arrays.sort(nums);
    int L = 0;
    int R = n-1;
    for(int i = 0;i<n;i++){
      
      while (L<R) {
        int target = nums[L] + nums[R];
        if(target==x){
          return true;
        }else if(target>x){
          R--;
        }else{
          L++;
        }
      }
    }
    return false;
  }

  public static boolean checkSum(int nums[] , int x ){
    int n = nums.length;
    for(int i = 0 ; i < n ; i++){
      // target = x - arr[i]
      int target = x - nums[i];
      for(int j = i+1;j<n;j++){
        if(target==nums[j]){
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args){

    int nums[] = {3,4,5,6,7};
    int x = 9;
    System.out.print("Result : "+checkSum(nums, x));
    System.out.println();
    System.out.print("Result : "+checkPair(nums, x));
    
  }
  
}
