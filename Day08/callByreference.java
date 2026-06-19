package Day08;

public class callByreference {

    public static void update(int marks[]){

        int l = marks.length;
        for(int i = 0;i<l;i++){

            marks[i] += 2;
        }

    }

    // CALL BY REFERNCE
    public static void main(String[] args){

        int marks[] = {80,56,45,67,10};

        update(marks);

        for(int i =0;i<marks.length;i++){ 
        System.out.print(marks[i] +" ");
        }
    }
    
}
