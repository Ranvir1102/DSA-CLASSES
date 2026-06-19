package Day01;

public class Factorial {
    public static int fact(int n){
        int store = 1;
        for(int i = 1; i<=n; i++){
            store = store * i;
        }
        return store;
    }
    public static void main(String[] args){
        System.out.println("Factorial : "+(fact(5)));
    }
    
}
