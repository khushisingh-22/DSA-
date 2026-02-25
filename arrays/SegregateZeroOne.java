public class SegregateZeroOneSimple {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        int countZero = 0;
        int countOne = 0;

        // Step 1: Count 0 and 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else {
                countOne++;
            }
        }

        // Step 2: Fill 0s first
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Step 3: Fill 1s
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}