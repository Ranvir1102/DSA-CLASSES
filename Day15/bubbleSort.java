package Day15;
public class bubbleSort {
  public static void main(String[] args){
    int weights[] = {6,4,1,3,8,2,7};
    int n = weights.length;
    int temp;

    for(int turns = 0 ; turns < n ; turns++){
      for(int j = 0 ; j < n - 1 - turns ; j++){
        if(weights[j] > weights[j+1]){
          temp = weights[j];
          weights[j] = weights[j+1];
          weights[j+1] = temp;
        }
      }
    }
    for(int i = 0 ; i < n ; i++){
      System.out.print(weights[i]+ " ");
    }
  }
}
