package Day10;

public class largest {

    public static void main(String[] args){

        int arr[] = {10,20,30,200,4,5,2};

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(highest<arr[i]){
                highest = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(lowest>arr[i]){
                lowest = arr[i];
            }
        }
        System.out.println(highest);
        System.out.println(lowest);
    }
    
}
