// LINEAR SEARCH ALGORITHM

package Day09;

public class LinearSearch {

    public static void main(String[] args){

        int arr[] = {10,23,45,54,12,34};
        int key = 12;
        boolean check = false;
        int l = arr.length;

        for(int i = 0; i<l;i++){
            if(arr[i]==key){
                check = true;
                System.out.println("Number Is Found At Index : "+i);
            }
        }
        if(check==false){
            System.out.println("Number Is Not Found");
        }
        else{
            System.out.println("Number Is Found");
        }
    }
    
}
