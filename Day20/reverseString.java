package Day20;

public class reverseString {
  public static String ReverseString(String str){
    int n = str.length();
    StringBuilder ans = new StringBuilder("");

    StringBuilder revString = new StringBuilder(str);
    revString.reverse();

    for(int i = 0 ; i < n ; i++){
      StringBuilder word = new StringBuilder(" ");
      while (i<n && revString.charAt(i) != ' ') {
        word.append(revString.charAt(i));
        i++;
        
      }
      word.reverse();
      if(word.length()>0){
        ans.append(" ").append(word);
      }
    }

    return ans.substring(1);
  }
  public static void main(String[] args){
    String str = "The Sky Is Blue";
    System.out.print(ReverseString(str));

  }
}
