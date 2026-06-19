package Day10;

public class binarySearch {

    public static void main(String[] args){

        // BINARY SEARCH ALGORITHM

        int nums[] = {10,20,30,40,50,60,70,80,90};

        int s = 0;
        int e = nums.length - 1;
        int key = 70;

        while(s <= e){

            int m = (s+e)/2;

            if(nums[m]==key){
                System.out.println("Number Found At Index : " +m);
                break;
            }
            else if(key < nums[m]){

                // go to left
                e = m - 1;
            }else{
                // go to right
                s = m + 1;
            }
        }
    }
    
}
