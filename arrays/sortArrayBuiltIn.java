import java.util.Arrays;
public class sortArrayBuiltIn{
     public static void main(String[] args) {
            // sort - asscending order
              
        int[] arr = {3,-5,-8,6};
        print(arr);//method or//before sorting
        Arrays.sort(arr);//built-in-sort
        print(arr);//after sorting
     }
        public static void print(int[]arr){
            for(int i=0; i<arr.length; i++){

                System.out.println(arr[i]);
        }
            
     }
}

// ques - Multiply odd indexed elem by 2 and add 10 to even index elem.

public class sortArrayBuiltIn {
    public static void main(String[] args) {

        int[] arr = {3, -5, -8, 6};

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {          // even index
                arr[i] = arr[i] + 10;
            } else {                   // odd index
                arr[i] = arr[i] * 2;
            }
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//ques - search in array 


public class sortArrayBuiltIn {
    public static void main(String[] args) {
       int[] arr = {3, -5, -8, 6};
        int key = -8;        // element to search
        boolean found = false;//false means element array me nhi h 

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;//element array me h 
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }
    }
}