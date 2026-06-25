package Day14;

public class trappedWater2 {
  public static void main(String[] args){
    int heights[] = {2,4,6,3,6,8,5};
    int l = heights.length;

    // leftmax array
    int leftmax[] = new int[l];
    leftmax[0] = heights[0];
    for(int i = 1 ; i < l ; i++){
      leftmax[i] = Math.max(heights[i],leftmax[i-1]);
    } 

    // rightmaxx array
    int rightmax[] = new int[l];
    rightmax[l-1] = heights[l-1];
    for(int i =  l-2;i>=0;i--){
      rightmax[i] = Math.max(heights[i], rightmax[i+1]);
    }

    // trapped water
    int trappedwater = 0;
    for(int i = 0 ; i < l ; i++){
      int waterlevel = Math.min(leftmax[i],rightmax[i]);
      trappedwater += (waterlevel - heights[i]);
    }
    System.out.print("Unit Of Water Trapped Is : "+trappedwater);
  }
}