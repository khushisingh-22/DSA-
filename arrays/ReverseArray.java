 public class ReverseArray{
    public static void main(String[] args) {
       int[] arr={3,4,5,6};
    //    for( int i=0; i<arr.length;i++){
    //     System.out.println(arr[i]);
    //    }
    //     // begnier frndly 
    //     for (int i = arr.length-1; i >=0; i--){
    //         System.out.println(arr[i]);
    //     }
       
    // advance approach  swaaping of array
    int n = arr.length;
    int i =0, j = n-1;
    while(i<j){
        int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;

    }
       for(int ele : arr) System.out.print(ele);
       

    }
}