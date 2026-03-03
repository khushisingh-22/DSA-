import java.util.*;

public class Addingtwo {
    public static void main(String[] args) {

        int[] a = {3, 4, 5, 5};
        int[] b = {4, 6, 7, 8};

        Vector<Integer> result = addTwoArrays(a, b);
        System.out.println(result);
    }

    static Vector<Integer> addTwoArrays(int[] a, int[] b) {

        Vector<Integer> res = new Vector<>();

        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;

        // add from last digit
        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) sum += a[i--];
            if (j >= 0) sum += b[j--];

            res.add(sum % 10);
            carry = sum / 10;
        }

        // reverse result
        Collections.reverse(res);
        return res;
    }
}