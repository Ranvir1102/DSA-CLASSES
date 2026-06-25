package Day15;
public class stockMarket {
  public static void main(String[] args){
    int price[] = {7,1,5,3,6,4};
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    int n = price.length;
    int day = 0;

    for(int i = 0 ; i < n ; i++){
      if(buyprice < price[i]){
        int profit = price[i] - buyprice;
        maxprofit = Math.max(profit,maxprofit);
        day = i;
      }else{
        buyprice = price[i];
      }
    }
    System.out.print("Profit Day Is : "+day);
    System.out.println();
    System.out.print("Profit Of : "+maxprofit);
  }
}
