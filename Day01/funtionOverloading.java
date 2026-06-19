package Day01;

public class funtionOverloading {

     public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c, int d){
        return a+b+c+d;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){

        System.out.println("Sum of Two Numbers : "+(sum(4,5)));
        System.out.println("Sum of Three Numbers : "+(sum(4,5,6)));
        System.out.println("Sum of Four Numbers : "+(sum(4,5,5,8)));
        System.out.println("Sum of Two Values : "+(sum(4.8f,5.9f)));

        

    }
    
    
}
