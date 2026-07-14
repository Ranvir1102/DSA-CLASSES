package Day14;
public class trappedWater {
  public static void main(String[] args){
    int height[] = {5,8,2,0,4,7,9,3,4,7};
    int l = height.length;
    // calculate the leftmax array
    int leftmax[] = new int[l];
    leftmax[0] = height[0];
    for(int i = 1;i<l;i++){
      leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }
    // calculate the rightmax array 
    int rightmax[] = new int[l];
    rightmax[l-1] = height[l-1];
    for(int i = l-2 ; i >= 0 ;i--){
      rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }
    // calculate the trappedwater
    int trappedwater = 0;
    for(int i = 0 ; i < l ; i++){
      // calculate waterlevel
      int waterlevel = Math.min(leftmax[i],rightmax[i]);
      trappedwater += (waterlevel - height[i]);
    }
    System.out.print("Unit Of Water Trapped Is : " +trappedwater);
  }
}
