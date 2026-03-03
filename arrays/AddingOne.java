import java.util.*;

public class AddingOne {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8};   // input digits

        Vector<Integer> result = addOne(arr);

        System.out.println(result); // output
    }

    static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int n = arr.length;

        // copy array into vector
        for (int i = 0; i < n; i++) {
            result.add(arr[i]);
        }

        // add one from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (result.get(i) < 9) {
                result.set(i, result.get(i) + 1);
                return result;
            } else {
                result.set(i, 0);
            }
        }

        // if all digits were 9
        result.add(0, 1);
        return result;
    }
}