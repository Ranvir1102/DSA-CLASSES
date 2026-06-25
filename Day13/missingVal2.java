package Day13;
import java.util.*;
public class missingVal2 {
  public static void main(String[] args){
    int nums[] = {4,7,8,9,3,2,0,1,6};
    int l = nums.length;
    int totalsum = 0;
    int mysum = 0;

    Arrays.sort(nums);
    for(int i = 0 ; i<=l ; i++){
      totalsum = totalsum + i;
    }
    for(int i = 0 ; i < l ; i++){
      mysum = mysum + nums[i];
    }
    int missing_num = totalsum - mysum ;
    System.out.print("Missing Value Is : "+missing_num);
  }  
}
