import java.util.Arrays;
public class shallowcopyDeepcopy{
     public static void main(String[] args) {
             int[]arr={12,56,4,5};// 16 byte leta h 
            //  int[] x = arr;// x is shalllow copy of arr.
            //  x[4] = 100;
            int[] y = Arrays.copyof(arr,arr.length); //deep copy
              y[0] = 10;
              System.out.println(y[0]);
              System.out.println(arr[0]);
            
     }
}


