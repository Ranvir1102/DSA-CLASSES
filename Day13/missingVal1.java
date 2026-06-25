package Day13;
import java.util.*;
public class missingVal1 {
  public static void main(String[] args){
    int nums[] = {0,1,3,5,4,6,7};
    int l = nums.length;
    Arrays.sort(nums);
    for(int i = 0 ; i < l ; i++){
      if(i != nums[i]){
        System.out.print("Missing Value Is : "+i);
        break;
      } 
    }
    System.out.println();
    System.out.print("NO VALUE IS MISSING");
  }
}