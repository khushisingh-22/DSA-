public class TWOSUM {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " and " + j);
                    return;   // answer mil gaya, program stop
                }
            }
        }

        System.out.println("No pair found");
    }
}

//ques:print the second  maximum element in the array 

public class TWOSUM {
    public static void main(String[] args) {

       int arr[] ={2,4,6,10};
       int max = Integer.MIN_VALUE;
       int smax = Integer.MIN_VALUE;
       //calculate max value 
       for ( int i=0; i<arr.length; i++){
        if(arr[i]>max) max=arr[i];
       }
           // calculate second largest 
       for (int i=0; i<arr.length; i++){
        if(arr[i]>smax && arr[i]!=max) smax=arr[i];
       }
       System.out.println(max);
       System.out.println(smax);
    }
    }
    

