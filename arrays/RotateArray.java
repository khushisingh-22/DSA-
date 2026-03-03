public class RotateArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int r = 2;
        int n = arr.length;

        r = r % n;   // safety

        // rotate r times
        for (int i = 0; i < r; i++) {
            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        // print rotated array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
        
    
    
    
