package Day08;

public class Arrays {

    public static void main(String[] args){

        // declaration of array

        // int marks[] = new int[50];

        int score[] = {10,20,30};

        String fruits[] = {"apple","banana","orange"};

        System.out.println(score[2]);
        // System.out.println(marks[1]);
        System.out.println(fruits[0]);

        // length of array
        //.length

        System.out.println("Length of Array:"+score.length);

        // updation in array

        score[0] = 45;

        // iterate on the array

        for(int i = 0; i<score.length;i++){
            System.out.println("score iss :"+score[i]);
        }




    }


    
}

// public class Arrays{
//     public static void main(String[] args){

//         int arr[] = {34,45,55,65,75};
//         System.out.println(arr[4]);
//     }
// }
